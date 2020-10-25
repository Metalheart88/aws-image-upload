# AWS Image Upload

_This is the backend repo. Please go to the following link to clone the frontend repo (React):_

https://github.com/Metalheart88/aws-image-upload-frontend

This project uses Spring Boot MVC for the backend. 

**Description**

Simple project that allows users to upload images to AWS S3 bucket and store them there with the ability to retrieve those images at any point of time.

**Project Setup:**
* Clone the repo
* Go to `src/main/resources` and create `application.properties` file with the following variables:
    * `spring.servlet.multipart.max-file-size=50MB` - this one is optional, you can enter any number for image size, totally up to you
    * `aws.accessKey=Your_AWS_Access_Key` - replace `Your_AWS_Access_Key` with your actual access key
    * `aws.secretKey=Your_AWS_Secret_Key` - replace `Your_AWS_Secret_Key` with your actual secret key
* Open `src/main/java/com.metalheart.awsimageupload/bucket/BucketName.java` and replace `PROFILE_IMAGE` string with your actual bucket name
* Clone the frontend repo to `src/main/`

**To Run the Project:**
* Open this cloned repo in IntelliJ and click Run button (_Shift+F10 on Win_)
* From your terminal go to `src/main/aws-image-upload-frontend` and run `npm install && npm start`

_Please note the project is using fake in-memory database_