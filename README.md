# Campus Mersys Testing Project 

**Two Week Sprint**

This repository contains the automated testing suite for the CampusMersys project, a web-based platform designed for educational institutions.
The tests cover various features available on the [Campus](https://test.mersys.io/) (test.mersys.io) website.

The Environment Used in the Project: [test.mersys.io](https://test.mersys.io/)

## Table of Contents

- [Project Overview](#project-overview)
- [Features Tested](#features-tested)
- [Technologies and Tools Used](#technologies-and-tools-used)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Contributors](#contributors)
- [Team Members](#team-members)
- [Contributing](#contributing)
- [Pull Request Rules](#pull-request-rules)
- [License](#license)

## Project Overview

Campus is an educational platform that provides a range of features for students to manage their academic activities. This testing project is focused on ensuring the reliability and functionality of the platform's features, including user registration, course management, assignment submissions, and more.

## Features Tested

The following user stories are tested in this project:

1. **Login Feature (US-001):**  Users can log into the system as students via "test.mersys.io" to access classes, learning materials, and communicate with peers and teachers. Includes validation for correct/incorrect login attempts.

2. **Home Feature (US-002):**  Clicking on the logo directs users to the course's home page for quick access to course information. Requires user authentication.

3. **Home Feature (US-003):** Ensures proper functionality of main feature buttons (e.g., Logo, Courses) for smooth navigation on the home page. Requires user authentication.

4. **Hamburger Menu / Messaging (US-004):**  Allows students to manage messages from the Hamburger Menu, including viewing new messages. Requires user authentication.

5. **Hamburger Menu / Messaging (US-005):**  Enables students to send messages from the Hamburger Menu, including selecting recipients, adding subjects, attaching files, and sending messages. Requires user authentication and message management.

6. **Hamburger Menu / Messaging (US-006):**  Provides the ability for students to delete messages from the Outbox in the Hamburger Menu. Requires user authentication and message management.

7. **Hamburger Menu / Messaging (US-007):**  Allows students to retrieve or permanently delete messages from the Trash in the Hamburger Menu. Requires user authentication and message management.

8. **Hamburger Menu / Finance (US-008):** Enables students to make payments by accessing the Finance link from the Hamburger Menu. Requires user authentication.

9. **Hamburger Menu / Finance (US-009):** Allows students to view installment details of their course on the finance page. Requires user authentication and access to finance information.

10. **Calendar Feature (US-010):** Provides students with a calendar to view and add notes to relevant dates. Requires user authentication.

11. **Course Feature (US-011):** Allows students to access a list of courses attended and view details of each course. Requires user authentication.

12. **Assignment Feature (US-012):** Provides students with a list of assignments related to their courses and allows them to view assignment details. Requires user authentication.

13. **Assignment Submission (US-013):** Enables students to submit assignments online, including file upload and adding comments. Requires user authentication.

14. **Grading Feature (US-014):** Allows students to view grades received for assignments and exams. Requires user authentication.

15. **Profile Update (US-015):** Enables students to update their profile information, including contact details and personal information. Requires user authentication.

16. **Password Reset (US-016):** Allows students to reset their password if forgotten, including receiving a password reset link via email. Requires user authentication.

17. **Notification Feature (US-017):** Provides notifications for important events and updates related to courses and campus activities. Requires user authentication.

18. **Chat Feature (US-018):** Enables students to chat with other students and teachers in real-time. Requires user authentication.

19. **Event Registration (US-019):** Allows students to register for campus events. Requires user authentication.

20. **Attendance Tracking (US-020):** Enables students to track their attendance for each course. Requires user authentication.

21. **Resource Library (US-021):** Provides access to a library of resources related to courses. Requires user authentication.

22. **Forum Feature (US-022):** Allows students to participate in discussion forums for their courses. Requires user authentication.

23. **Document Submission (US-023):** Enables students to submit documents for administrative purposes. Requires user authentication.

24. **Course Material Access (US-024):** Allows students to access course materials uploaded by teachers. Requires user authentication.

25. **Survey Participation (US-025):** Enables students to participate in surveys conducted by the campus administration. Requires user authentication.
  ![US025CalendarVidRecord](https://github.com/user-attachments/assets/8e75dac8-f001-4bbc-9980-d8a3f23d6d54)


## Technologies and Tools Used

The basic technologies and tools to be used in this project include:

- **Java** - Programming language.
- **Selenium** - Web browser automation.
- **Cucumber** - Behavior Driven Development (BDD) framework.
- **TestNG** - Testing framework.
- **ExtentReports** - Reporting library.
- **Apache POI** - Library for reading and writing Excel files.
- **Java Faker** - Library for generating fake data.
- **Maven** - Dependency management and Build
- **slf4j** - Simple logging facade for java 
- **Git & GitHub** - Version control Systems 
- **JIRA & XRAY** - Test management Tools
- **Page Object Model (POM)** - Test Automation Pattern
- **Grasshopper** -	HTML & PDF Report tool.

## Prerequisites

- Java Development Kit (JDK): Installed on your system for Java code writing and compilation.

- IDE (Integrated Development Environment): Choose IntelliJ IDEA, Eclipse, or NetBeans for Java development.

- Maven: Installed for dependency management and project build tasks.

- Git: Installed for version control, essential for managing your project's source code on GitHub.

- Selenium WebDriver: Familiarize yourself with its usage and basic automation techniques.

- TestNG: Understand its annotations and how to write test cases using this framework.

- Cucumber: Learn the basics of BDD and writing feature files and step definitions.

- Page Object Model (POM): Understand and implement this pattern in your test automation framework.

- Extent Report or Similar Reporting Tool: Familiarize yourself with integrating and generating test reports.

- JIRA & XRAY or Similar Test Management Tools: If using, ensure access and understand test case creation, management,
  and defect reporting.

- Logging with slf4j: Learn to configure and use for logging in your Java project.

## Getting Started

The easiest way to get started is to clone the repository:

```bash
# File > New > Project From Version Control
# Copy to URL
git@github.com:Mednasa/CampusMersys_Project.git

# Open project in IntelliJ
# Select project JDK
jdk11

# Load Pom
Click to `pom.xml` > Maven > Reload Project

# Run All Tests
Click to Runners > `TestRunnerAll` and Run

#Configure test settings:

Update any necessary configuration files (e.g., src/test/resources/config.properties) with your specific settings.
```
## Project Structure
```
C:.
├───.idea
├───src
│   ├───main
│   │   ├───java
│   │   └───resources
│   └───test
│       ├───java
│       │   ├───featureFiles
│       │   ├───hooks
│       │   ├───pages
│       │   ├───runners
│       │   ├───stepDefinitions
│       │   └───utilities
│       └───resources
└───target
    ├───generated-test-sources
    │   └───test-annotations
    └───test-classes
        ├───pages
        ├───runners
        ├───stepDefinitions
        └───utilities
```

## Contributors
| User Stories                                     | Contributor                  |
|------------------------------------------------|------------------------------|
| [03-04-07-13-15-17-21] | [Sefa Kahraman](https://github.com/SefaKahramann) |
| [05-06-09-14-20-24] | [Merve Kaya](https://github.com/kayyamervee) |
| [02-08-10-16-23-25] | [Ümmühan Teke](https://github.com/UmmuhanTeke) |
| [01-18] | [Mert Bilecen](https://github.com/MertBilecen) |
| [11] | [Söngül Çam](https://github.com/songul-cam) |



## Team Members
| Name                    | Role            | GitHub                                           | 
|-------------------------|-----------------|--------------------------------------------------|
| Merve KAYA              | QA Automation Engineer                  | [Merve Kaya](https://github.com/kayyamervee)   | 
| Ümmühan TEKE            | QA Automation Engineer                  | [Ümmühan Teke](https://github.com/UmmuhanTeke) | 
| Songül ÇAM              | QA Automation Engineer                  | [Songül Çam](https://github.com/songul-cam) | 
| Mert BİLECEN            | QA Automation Engineer                  | [Mert Bilecen](https://github.com/MertBilecen) |
| Sefa KAHRAMAN           | Project Lead & QA Automation Engineer   | [Sefa Kahraman](https://github.com/SefaKahramann) |

## Contributing
Contributions are welcome! If you find any issues or want to add more tests, feel free to open a pull request.
Please follow these steps to contribute:

- Fork the repository.
- Create a new branch for your feature or bugfix.
- Make your changes and commit them.
- Push to your branch.
- Create a pull request.

## Pull Request Rules

When contributing to this project, please adhere to the following guidelines:

1. **Create a Descriptive Pull Request Title**: Ensure that your pull request title clearly describes the changes you're making.

2. **Provide Detailed Descriptions**: In your pull request description, provide a clear and detailed explanation of the changes you've made and why they are necessary.

3. **One Pull Request per Feature**: If you're adding multiple features or making several changes, please submit each as a separate pull request.

4. **Follow Code Standards**: Maintain code cleanliness and adhere to the coding standards used in the project.

5. **Test Your Changes**: Before submitting a pull request, test your changes thoroughly to ensure they work as expected and do not introduce any regressions.

6. **Update Documentation**: If your changes impact any documentation, make sure to update it accordingly.

7. **Resolve Conflicts**: If there are any conflicts with the base branch, resolve them before submitting your pull request.

8. **Request Reviews**: Assign reviewers to your pull request to ensure that your changes are properly reviewed before merging.

9. **Be Responsive**: Respond promptly to any feedback or comments on your pull request.

10. **Ensure CI/CD Passes**: Ensure that all continuous integration (CI) checks pass before merging your pull request.

## License

This project is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).


