# API Automation Test Framework using REST Assured RajaOngkir

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

## Library and Dependencies

- Repositories use mavenCentral
- Dependencies Implementation use TestNG, Rest Assured, Assertj Core, Json and Json Schema Validator
- Gradle use TestNG

## Description

- About src/test/java/apiautomation/AutomationRajaOngkir.java

  - This is a source code to running test and function from Raja Ongkir
  - Test 1 : testGetListProvince (Display all data province)
  - Test 2 : testGetListCity (Display all data city)
  - Test 3 : testCostRajaOngkir (Display all data delivery cost)
  - Test 4 : testLogin (Display login page, verify username and password)
  - Test 5 : testWrongURL (Web page cannot display if user enters the wrong link address or typo)
  - Test 6 : testWrongMethod (Display the wrong method)

- About src/test/resources/jsonSchema
  This is path to save all file assertion schema json and file xml

## Running the tests

To execute the automated tests for all task, run the following Gradle task:

```
./gradlew test

```

These commands will run the Cucumber tests with the specified configurations and generate HTML test reports in the "reports" directory.

## Built With

- Gradle: The build tool used for managing dependencies and building the project.

## Screenshoot Result Running Test

- https://github.com/AdrianHart/PR18Module20/blob/main/Run%20Test%20Image%20RajaOngkir.PNGu
