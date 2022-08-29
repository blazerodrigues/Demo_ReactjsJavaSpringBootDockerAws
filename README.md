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
6. EC2 instance was created, instance type used was t2.large. Changes were made to the security group, to allow requests from my local PC.
7. Docker was installed on the EC2 instance.
8. Docker Images were PULLED from the ECR service to the EC2 instance.
9. Docker Images were RUN.
10. Application ran successfully on AWS.

EC2 Screenshot <br/>
<img width="960" alt="image" src="https://user-images.githubusercontent.com/96373227/187276776-f90ecce9-d9d5-4ec2-ad9e-c3cb9f9e3ee6.png">
<br/>

ECR Screenshot <br/>
<img width="960" alt="image" src="https://user-images.githubusercontent.com/96373227/187277285-01261c0b-92ca-4340-905a-d0de687b8d8f.png">
<br/>

Local to AWS ECR connection using AWS CLI: <br/>
<img width="959" alt="image" src="https://user-images.githubusercontent.com/96373227/187277823-139fb836-daba-44f2-9c3a-69cdcbb04ec5.png">


