# UEN Validator

This is a simple Java program that checks if a UEN (Unique Entity Number) is valid based on three known formats.

*Disclaimer: This validator does not check alphabet.*
##  How to Run

1. Make sure Java is installed (`java -version`).
2. Open terminal and go to the folder with the `.jar` file.
   (File is located in out/artifacts/AcraValidation_jar)
3. Run: 
```bash
java -jar AcraValidation.jar
```
## How to Use



You'll be asked to input a UEN:

```bash
Enter a UEN to validate: 000012345X
Wrong UEN.

Enter a UEN to validate: 20191234Z
Valid UEN!

```
The project closes when you get a Valid UEN!
