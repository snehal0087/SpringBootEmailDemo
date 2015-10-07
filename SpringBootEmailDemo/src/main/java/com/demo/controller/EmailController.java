package com.demo.controller;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Email;
import org.springframework.util.Assert;

@RestController
@RequestMapping(value = "/email")
public class EmailController {

	private static final Logger logger = LoggerFactory.getLogger(EmailController.class);

	@Autowired
	private JavaMailSender javaMailSender;

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public String sendEmail(@RequestBody Email email) throws Exception {
		Assert.notNull(email, "Email must not be null");

		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setTo(email.getRecipientEmailId());
		helper.setSubject(email.getEmailSubject());
		helper.setText(email.getEmailMessage(), true); // true indicates html
		// Send Email
		javaMailSender.send(message);
		logger.debug("Email send to {} ", email.getRecipientEmailId());
		return "Email Send Successfully";
	}
}
