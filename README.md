# Capstone Project: Password Validator
Welcome to the Capstone Project. 

## About
The project aims to provide a secure and robust passwod validation system. It validates the user password strength by running it through differenet test cases. 

## Features
The Capstone Project offers the following features for password validation:

- Minimum and maximum length requirements.
- Inclusion of uppercase and lowercase characters.
- Presence of numbers and special characters.
- Absence of common passwords and username in the password.

## Project Structure
- App.java: The main class where the code execution will begin.
- Input.java: This is responsible to take user input. 
- UserCredentials.java: This implements the setter & getter functionality to the code to store and keep the username and password private and secure. 
- Validator.java: Interface to declare the methods for all the test cases to run on the user password.
- Test.java: Adapter class to define and implement the functionality of Validator Interface.
- InavlidPassword.java: Custom Exceptoin class to ensure a custom exception to handle the Invalid Password errors. Also gives the custom error message for all the test cases.
- SpecialChars.java: Performs checks for Special Charaters. Reduces the code redundancy by allowng the reusability of code. 

## Major Functions: 
- main(String args[]): Main method or point of entry of the application.

### Input:
- get_user(UserCredentials): Method to get the username input from the user and store it in the UserCredentials object.
- get_pass(UserCredentials): Method to get the password input from the user and store it in the UserCredentials object.

### Storage: 
- setUsername(String): Method to set the username.
- getUsername(): Method to get the username.
- setPassword(String): Method to set the password.
- getPassword(): Method to get the password.

### Test cases: 
- pass_min_length(String): Checks if the password meets the minimum length requirement.
- pass_max_length(String): Checks if the password exceeds the maximum length limit.
- passContainsUpperCase(String): Checks if the password contains at least one uppercase character.
- passContainsLowerCase(String): Checks if the password contains at least one lowercase character.
- passContainsDigits(String): Checks if the password contains at least one digit.
- passContainsThreeSpecialChars(String): Checks if the password contains at least three special characters.
- passStartsWithSchar2Digit(String): Checks if the password starts with a special character or a double-digit number.
- passContains3Upper3LowerChar(String): Checks if the password contains at least three uppercase and three lowercase characters.
- passSameCharSequenceCheck(String): Checks if the password contains the same character sequence more than five times consecutively.
- passContainsUsername(String, String): Checks if the password contains the username.
- passScharSequenceCheck(String): Checks if the password contains the same special character sequence more than twice consecutively.
- passCommonPasswords(String): Checks if the password is a common password by comparing it with a list of common passwords.

## Access Modifiers 
For better security `public`, `protected` and `private` access modifiers are used. 

- protected get_user(UserCredentials)
- protected get_pass(UserCredentials) 

- private username
- private password

