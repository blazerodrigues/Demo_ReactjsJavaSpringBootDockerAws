# Employees Demo: React.js, Spring Boot, Docker, AWS Deployment

Frontend: React.js <br/>
Backend: Spring Boot <br/>
Database: H2 database <br/>
Container: Docker <br/>
AWS Deployment: Elastic Compute Cloud (EC2), Elastic Container Registry (ECR) services <br/>

Application working:
<img width="960" alt="image" src="https://user-images.githubusercontent.com/96373227/187273314-5b6ce215-e865-48f9-b6a0-ce8f5957e12e.png"> <br/>

# Deployment

1. Spring Boot Docker Image was created using "mvn spring-boot:build-image".
2. React.js Docker Image was created by making a Dockerfile, then using VS Code and Docker Extension to Build Image.
3. Private repositories were created on AWS ECR service, to store the Docker Images on the cloud.
4. IAM user was created with attached policy name AmazonEC2ContainerRegistryFullAccess, to allow connection to ECR from local machine, using AWS CLI.
5. Docker Images were pushed from the local machine to ECR.
6. EC2 instance was created, instance type used was t2.large.
7. Docker was installed on the EC2 instance.
8. Docker Images were PULLED from the ECR service to the EC2 instance.
9. Docker Images were RUN.
10. Application ran successfully on AWS.

