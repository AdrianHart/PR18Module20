# API Automation Test Framework using REST Assured

## Overview

This project provides two test frameworks for automating API and web application testing. The API Automation Test Framework utilizes REST Assured, while the Web Automation Test Framework uses Selenium. Both frameworks are integrated with Cucumber for behavior-driven development. Using Java and Gradle as the programming language and build tool.

- API automation task : https://rajaongkir.com/dokumentasi/starter

## Getting Started

These instructions will guide you on how to set up the project on your local machine for development and testing purposes.

### Prerequisites

Before getting started, ensure that you have the following software installed on your machine:

```
1. Java JDK: download and install the latest version of Java JDK from the official Oracle website (https://www.oracle.com/id/java/technologies/downloads/).
2. Gradle: Install Gradle by following the official Gradle installation guide (https://gradle.org/install/), but in this case, we are using 'gradlew'.

```

### Installing

To set up the development environment, follow these steps:

1. Clone this repository to your local machine using Git or download the ZIP file and extract it.
2. Open the project in your preferred Java IDE (e.g., IntelliJ or Eclipse).
3. Build the project and download dependencies using Gradle by running the following command in the terminal:

```
./gradlew build

```

## Running the tests

To execute the automated tests for API only, run the following Gradle task:

```
./gradlew api

```

These commands will run the Cucumber tests with the specified configurations and generate HTML test reports in the "reports" directory.

## Built With

- Gradle: The build tool used for managing dependencies and building the project.
