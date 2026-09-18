# Placement Analytics Engine

## Overview
The placement Analytics Engine is a command-line based Java application designed to evaluate and classify student profiles for recruitments. It processes academic scores and coding ratings to determine placement eligibilty and in what bracket (eg. High/low tiers etc.), making the preliminary filtering process to be easier for the placement cells.

## Features
* **Candidate Registration:** In-memory CRUD operations to add new applicants dynamically.
* **Algorithmic Classification:** Automated tier assignment based on a weighted evaluation of CGPA and coding platform ratings.
* **CLI Reporting:** Generates a tabular summary of all registered candidates and their placement eligibility.
* **Fault Tolerance:** Robust input validation using exception handling to prevent system crashes from invalid data entries.

## Technologies Used
* **Language:** Java (JDK 11 or higher)
* **Paradigm:** Object-Oriented Programming (Encapsulation, Modular Design)
* **Interface:** Command-Line Interface (CLI)

## Setup and Execution Instructions

### Prerequisites
Ensure you have the Java Development Kit (JDK) installed and configured in your system's PATH.

### Installation
1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/shivanshprashant/Placement-Analysis-Engine
    ```
2. Navigate to the project directory: 
     ```bash
     cd Placement-Analysis-Engine
      ```

### Running the Project
1. Compile all Java source files from the root directory:
     ```bash
     javac *.java
      ```
2. Execute the main system runner: 
     ```bash
     java SystemRunner
      ```

### Instructions for Testing
1. Launch the application.
2. Select Option 1 to add a candidate.
3. When prompted, enter a valid string for the name, integers for Roll Number and Coding rating, and a decimal for the Academic Score (eg., 8.5).
4. Select Option 1 again and intentionally input a string when an integer is requested to test the exception handling and input validation.
5. Select Option 2 to view the generated analytics report.
6. Select Option 3 to terminate the system.