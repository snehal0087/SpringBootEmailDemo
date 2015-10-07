# SpringBootEmailDemo
Simple Spring Boot rest service to send Email using Gmail

Run project as Spring Boot App <br />
Hit the service using rest client like Postman

Rest Service URL:
http://localhost:8080/email/send

Request Body:
```json
{
  "recipientEmailId": "your email ID",
  "emailSubject": "test Email",
  "emailMessage": "Hello , hope you are doing awesome!!!"
}
```
Note: replace your email ID with the email id to whome you want to send email.<br />
Also replace the username with your Gmail id and password in application.properties file
