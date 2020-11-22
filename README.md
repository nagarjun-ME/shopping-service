# Micro-Service Communication



There are five Micro-Services :


	1. DB Service : 
		CRUD operations are implemented to make calls to H2 DB 

	2. Order Service : To place an order 
		This service calls the Item service to place an order

	3. Item Service : used to catalog items
		a. Makes REST API call to DB service to pull product information
		b. It serves Order service through Rest Calls
	4. Payment service : to store pay,emt details
	5. Neflix Eureka Service Manager
		a. It handles service discovery 
		b. Acts as a service manager
		
---------------------------------------------------------------------------------

## API’s  Covered:

    • Spring Boot
    • Spring Cloud
    • Eureka Service Manager
    • Lombok
    • H2 JDBC Connectivity
    • Micro-service Communication
    • Service Discovery and Management
    • Docker Container
    • Netflix Eureka Client



-----------------------------------------------------------------------------------


## You can find more on Spring boot + Docker


### [Micro-service and Containerization using Docker](https://github.com/nagarjun-ME/DockerGitSprinBootServiceApplication.git)

### [You can find the Docker image here](https://hub.docker.com/repository/docker/nagarjunmqdev/springdocker-gitapp-v1)



### [JMS using Middleware technologies like IBM MQ V9.2](https://github.com/nagarjun-ME/jms-springboot)

### [Docker Image here](https://hub.docker.com/repository/docker/nagarjunmqdev/ibmmqtest)

