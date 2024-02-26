Problem Scenario

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

However, you encounter challenges:

Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
Optional fields: Not all customers provide complete information, but the constructor forces them to.
Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.
Implement solution using the Builder Pattern to address the issue.

===== Problem Scenario Ends here =====

## Refer to the UML Class Diagram
![BuilderPattern_UML_Class_Diagram](https://github.com/alea-progaming/SoftEng2-3CS1/assets/110019094/4dc6e4e5-2838-4fca-b4ef-1b7a0b8907d0)
