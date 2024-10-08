# Distributed E-Commerce Application

This project is a **distributed E-Commerce application** built using a **microservices architecture** with **Spring Boot 3** and **Spring Cloud**. It is designed to provide a robust, scalable, and secure platform for managing customers, products, orders, and payments, with a focus on flexibility and smooth deployment.

## Features

- **Microservices Architecture**: 
  The application is divided into multiple independent services, each with a specific responsibility:
  - **Customer Service**: Manages customer information and profiles.
  - **Product Service**: Handles product catalog and inventory.
  - **Order Service**: Manages order placement and tracking.
  - **Payment Service**: Processes payments securely.
  - **Notification Service**: Sends notifications to customers regarding order and payment status.

- **Inter-service Communication**:
  - **Synchronous Communication**: Uses **OpenFeign** and **RestTemplate** for efficient RESTful communication between services.
  - **Asynchronous Communication**: Leverages **Apache Kafka** for handling payment and order confirmations, ensuring event-driven and decoupled service interactions.

- **Security**: 
  Integrates **Keycloak** for authentication and authorization, ensuring secure access to services.

- **Configuration and Discovery**:
  - **Config Server**: Centralized configuration management for all services.
  - **Eureka**: Service discovery and registration for seamless communication between microservices.

- **Tracing and Monitoring**: 
  Implements **Zipkin** for distributed tracing, providing deep insights into service interactions and simplifying debugging.

- **Deployment**: 
  Managed with **Docker** and **Docker Compose**, enabling easy setup and scalability of the microservices infrastructure.

## Tech Stack

- **Java 21**, **Spring Boot 3**, **Spring Cloud**
- **Docker**, **Docker Compose**
- **Apache Kafka**
- **Keycloak** for security
- **Eureka**, **Config Server**, **Zipkin**

## Getting Started

To run the application locally, follow these steps:

1. **Clone the repository**:
   ```
   bash
   git clone https://github.com/yourusername/ecommerce-app.git
   cd ecommerce-app
2. **Set up Keycloak**:

Download and run the Keycloak server.
Import the realm configuration file located in the keycloak directory.
3. **Start services with Docker Compose**:
```
docker-compose up -d
```
4. **Access the application**:

Open http://localhost:8761 to view the Eureka dashboard.
Visit http://localhost:9411 for the Zipkin tracing interface.
## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests for improvements and bug fixes.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Contact
For any inquiries or support, reach out to eryk.kubiak.firma@gmail.com.
