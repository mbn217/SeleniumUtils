```markdown
# SeleniumUtils
#Author: Mohamed Nheri

## Overview
SeleniumUtils is a Java utility library designed to simplify common Selenium WebDriver tasks. It provides methods for interacting with web elements, managing dropdown selections, and more.

## Features
- Select elements from dropdowns by value or index.
- Integration with TestNG for testing.
- Logging support using Log4j.
- WebDriver management with WebDriverManager.
- Reporting with ExtentReports.
- Data generation with JavaFaker.

## Requirements
- Java 11
- Maven

## Installation
To include SeleniumUtils in your project, add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.mbn217</groupId>
    <artifactId>seleniumutils</artifactId>
    <version>1.0.1-SNAPSHOT</version>
</dependency>
```

## Usage
### Selecting an Element by Value
```java
import org.openqa.selenium.WebElement;
import utilities.SeleniumUtils;

// Assuming 'element' is a WebElement representing a dropdown
SeleniumUtils.selectElementByValue(element, "value");
```

### Selecting an Element by Index
```java
import org.openqa.selenium.WebElement;
import utilities.SeleniumUtils;

// Assuming 'element' is a WebElement representing a dropdown
SeleniumUtils.selectElementByIndex(element, 1);
```

## Dependencies
The project relies on the following dependencies:
- Selenium Java (4.19.1)
- TestNG (7.9.0)
- Apache POI (3.17)
- WebDriverManager (5.5.3)
- ExtentReports (5.0.9)
- Log4j (2.23.1)
- JavaFaker (1.0.2)

## Building the Project
To build the project, run the following Maven command:
```sh
mvn clean install
```

## License
This project is licensed under the MIT License.

#Todo
- Add more utility methods for common Selenium tasks.
- Add support for additional testing frameworks.
- Add support for additional logging frameworks.
- Add support for additional reporting frameworks.
- Add support for additional data generation libraries.
- Add support for additional WebDriver management tools.
- Add support for additional Java versions.


You like it? Give a star. Thank you!