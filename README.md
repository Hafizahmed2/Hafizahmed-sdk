
# Getting Started with LOTR

## Introduction

The One SDK To Rule Them All provides you with information about the books, the movie trilogy, many characters and quotes from "The Lord of the Rings", the epic masterpiece epos by J.R.R. Tolkien

## Building

Supported Java version is **11+**.

Dependencies added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

## Installation

The following section explains how to use the LOTRLib library in a new project.

### Building the project

To build the project, you will either need to have maven installed or have a suitable IDE setup which comes with a built-in maven installation. Depending on the IDE, you can build the project by simply importing the pom file with the "Open as Project" option

To build directly from maven, run the following command in the root directory:

*mvn clean install*

This will build a jar file in the target repository and also store it in your local maven repository so it is available to be used in any of your future projects
### 2. Use the SDK in another project

Any newly created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *LOTRSdk*, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button

Or you can add the dependency manually in the project's pom.xml file

### 3. Write sample code

Now that you have added it as a dependency, the LOTRSdk Object should be available to be used in your new project which will provide you with any information you might need about the legendary franchise.

## Test the SDK

The SDK can be tested using the added test cases.
JUnit is used as the testing framework and test runner.

In Your IDE, for running the tests do the following:

1. Select the project from the package explorer.
2. Select `Run -> Run as -> JUnit Test`

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

api.uri
api.accesstoken

## Authorization

This API uses `OAuth 2 Bearer token`.

## List of APIs

* [Book](doc/controllers/book.md)
* [Movie](doc/controllers/movie.md)
* [Character](doc/controllers/character.md)
* [Quote](doc/controllers/quote.md)
* [Chapter](doc/controllers/chapter.md)

## Classes Documentation

* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

Given more time, I would have enhanced the SDK with the following improvements:

- Add much more additional functionality such as Highest Grossing Movie, Longest Movie, Most Decorated Movie, Characters by Realm and much more
- Add Complete Test coverage for each component and scenario
- Refactor filtering mechanism to filter via request to API rather than fetching all data and then filtering it
- Refactor Code as needed
- Remove unnecessary code as needed
- Add Configuration Files according to Profiles
- Integrate with Spring Boot

- ..and much more