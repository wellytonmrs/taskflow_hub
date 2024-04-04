# Taskflow Hub - Collaborative Project Management Platform

Taskflow Hub is a robust project management platform designed to enhance team collaboration, streamline task management, and provide real-time insights into project progress. This full-stack application utilizes modern technologies such as React, TypeScript, Java, Spring Boot, Keycloak, PostgreSQL, Gradle, Git, Redis, GraphQL, and Kafka.
The main goal of this project is to learn and apply those technologies using best practices. 

## Features

1. **User Authentication with Keycloak:**
   - Secure user authentication using Keycloak for single sign-on (SSO).
   - Registration, login, and password recovery functionalities.

2. **Task Management with Real-time Updates:**
   - Create, edit, and delete tasks with React and TypeScript.
   - GraphQL for querying and mutating task data.
   - Real-time updates using WebSocket and Kafka for efficient collaboration.

3. **Project Dashboard with Data Visualization:**
   - Visualize project progress and statistics with interactive charts and graphs.
   - Fetch project data from a Spring Boot backend with PostgreSQL as the database.

4. **Collaborative Real-time Chat:**
   - Real-time chat feature using React, TypeScript, and GraphQL subscriptions.
   - WebSocket integration for instant communication within the team.

5. **Event Sourcing and CQRS:**
   - Implement Event Sourcing and CQRS pattern using Spring Boot and Kafka.
   - Store events in PostgreSQL for a reliable event history.
   - Redis for caching frequently accessed data.

## Additional Components

1. **Git Integration:**
   - Version control within the platform, allowing teams to track code changes related to the project.

2. **Gradle for Build Automation:**
   - Build automation with Gradle to streamline the development process and manage dependencies.

3. **Redis for Caching:**
   - Utilize Redis for caching frequently accessed data, improving application responsiveness.

4. **GraphQL for Flexible API:**
   - Flexible and efficient data queries using GraphQL, enabling clients to request only necessary data.

## Getting Started

Follow these steps to set up CollaboraPlan locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/wellytonmrs/taskflow_hub.git
   cd taskflow_hub

2. Start keycloak server locally using docker:

    ```bash
   docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.5 start-dev

3. 

   

