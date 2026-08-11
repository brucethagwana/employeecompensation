![Static Badge](https://img.shields.io/badge/Java-%20%23f89820%20?style=for-the-badge&logo=Java)
![Static Badge](https://img.shields.io/badge/IntelliJ%20IDEA-%230047E4?style=for-the-badge&logo=IntelliJ%20IDEA&logoColor=%23000000&labelColor=%23FFFFFF)
![Static Badge](https://img.shields.io/badge/Spring%20Boot-%236DB33F?style=for-the-badge&logo=Spring%20Boot&labelColor=%23FFFFFF)
![Static Badge](https://img.shields.io/badge/Apache%20Maven-%23C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=%23812878&labelColor=%23FFFFFF)
![Static Badge](https://img.shields.io/badge/git%20-%23F05032?style=for-the-badge&logo=git&labelColor=%23FFFFFF)
![Static Badge](https://img.shields.io/badge/Neo4j-%23014063?style=for-the-badge&logo=Neo4j&logoColor=%23014063&labelColor=%23FFFFFF)
![Static Badge](https://img.shields.io/badge/MongoDB-%2300684A?style=for-the-badge&logo=MongoDB&logoColor=%2300684A&labelColor=%23FFFFFF)
![Mongoose ODM](https://img.shields.io/badge/Mongoose-ODM-800000?style=for-the-badge&logo=mongoose&logoColor=white)
![Static Badge](https://img.shields.io/badge/GraphQL-%23E10098?style=for-the-badge&logo=GraphQL&logoColor=%23E10098&labelColor=%23FFFFFF)
![Apache Kafka](https://img.shields.io/badge/Apache_Kafka-231F20?style=for-the-badge&logo=apachekafka&logoColor=white)

# Fiscal: Employee Compensation

> **Event-driven Agentic AI facilitating strategic dialogue and complex reasoning in global tax policy.**

Welcome to **Fiscal**, an intelligent platform engineered to combine autonomous agentic reasoning with rigorous tax levy computation. The platform unifies specialized AI capabilities with an immutable, event-sourced backbone, facilitating strategic dialogue, policy simulation, and highly auditable tax compliance modeling across global jurisdictions.

---

## Table of Contents

* [Features](#features)
* [Architecture](#architecture)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
* [Installation](#installation)
* [Running the Application](#running-the-application)
* [Usage](#usage)
* [License](#license)

---

## Features

* **Agentic Tax Reasoning:** Autonomous multi-agent dialogue for evaluating dynamic tax scenarios, compliance options, and cross-border policy impacts.
* **Precision Levy Calculation:** High-precision computational engine designed for applying complex, multi-jurisdictional tax rules and financial logic.
* **Immutable Event Trail:** Complete historical auditability for all state changes, financial calculations, and policy evaluations.
* **Graph & Document Projections:** Neo4j graph relationships for tracking policy and domain connections combined with MongoDB read models for fast GraphQL querying.
* **External Tax API Integration:** Flexible infrastructure to connect with third-party tax calculation services for real-time assessment.
* **Comprehensive User & Taxpayer Management:** Granular identity management ensuring secure, personalized compliance contexts.

---

## Architecture

To avoid non-deterministic outputs common in regulatory AI systems, **Fiscal** anchors autonomous agent decisions to a deterministic backbone built on **Command Query Responsibility Segregation (CQRS)**, **Event Sourcing**, and **Domain-Driven Design (DDD)**.

### Core Architectural Pillars

* **Command Query Responsibility Segregation (CQRS):**
  * **Command Side (Writes):** Managed by **Spring Boot** applications to evaluate domain rules, execute financial commands, and persist state changes as domain events.
  * **Query Side (Reads):** Denormalized read models are updated asynchronously in **MongoDB** for fast document retrieval and exposed via **GraphQL**.
* **Event Sourcing & Auditability:** Instead of storing mutated records, every policy evaluation, calculation input, and state change is stored as an immutable sequence of events. This ensures an exact forensic record required for tax regulatory compliance and audit trails.
* **Graph Context (Neo4j):** Complex relationship structures—such as jurisdictional dependencies, tax policy hierarchies, and employee entity graphs—are projected into **Neo4j** to supply multi-dimensional context to AI agents.

### Architectural Resources

For a comprehensive understanding of the design patterns used in this repository:
* **CQRS Data Patterns:** [Bob Reselman's illustrated guide to CQRS data patterns (Red Hat)](https://redhat.com/en/blog/illustrated-cqrs)
* **Event Sourcing Fundamentals:** [Martin Fowler's Event Sourcing Article](https://martinfowler.com/eaaDev/EventSourcing.html)
* **Event Driven Architecture:** [Tim Berglund's Events, Data, and Action (Confluent)](https://www.confluent.io/designing-event-driven-systems/)

---

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Ensure you have the following installed and configured:

* **Java Development Kit (JDK):** Version 17 or higher (e.g., OpenJDK).
* **Maven:** Version 3.x.x (for building the Spring Boot application).
* **Neo4j Database:** A running instance of Neo4j (Community Edition is sufficient).
  * You can run it locally, or via Docker:
    ```bash
    docker run --name neo4j -p 7474:7474 -p 7687:7687 -e NEO4J_AUTH=neo4j/password -d neo4j
    ```
* **MongoDB Database:** A running instance of MongoDB.
  * You can run it locally, or via Docker:
    ```bash
    docker run --name mongodb -p 27017:27017 -d mongo
    ```
* **Git:** For repository management and cloning.
* **Optional:** A GraphQL client library or browser interface for querying MongoDB read models.

---

## Installation

```bash
git clone https://github.com/brucethagwana/employeecompensation.git
cd employeecompensation
mvn clean install
```

---

## Running the Application

```bash
mvn spring-boot:run
```

---

## License

This project is licensed under the [MIT License](https://github.com/brucethagwana/employeecompensation/blob/main/LICENSE) - see the [License](https://github.com/brucethagwana/employeecompensation/blob/main/LICENSE) file for details.
