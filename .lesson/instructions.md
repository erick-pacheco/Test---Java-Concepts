# Instructions  
### Description:
This activity will help you reinforce what you've learned about objects, classes and constructors and provide practice reading and implementing code in Java. Your goal is to complete implementation of the Patient class and verify the functionality using the Main class.

Please follow the steps below:

### Steps:
1. Add the following code to the 'Bill.java' file:
```Java
class Bill {

  private double amount;
  private String date;

  public Bill(double amount, String date) {
    this.amount = amount;
    this.date = date;
  }
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
  }

  @Override
  public String toString() {
    return "Billing date: " + this.date + ". Bill amount: " + this.amount;
  }
  
}
```
This class allows us to create Bill objects. It defines the following:
- two `private` instance variables, *amount* and *date*
- a parameterized constructor that initalizes *amount* and *date* using the parameter values
- a getter and setter for *amount*
- and an overridden `toString()` method

2. Now you'll create a Patient class. In `Patient.java`, create a class that defines the following:
- 2 `private` instance variables of the `String` type called *name* and *illness*
- 1 `private` instance variable of the type `ArrayList<Bill>` with the name *bills* (make sure to import the ArrayList class from the `java.util` package)
- a parameterized constructor that takes two values. The first should be a `String` parameter to initialize the field *name*. The second parameter should be an `ArrayList<Bill>` to initialize the field *bills*.
- getters and setters for *name* and *illness*
- a method named *addBill()* that takes in a parameter of the `Bill` type and adds the bill to the list *bills* using the `add()` method for ArrayList objects.
- an overridden *toString()* method that returns the following String: `"[Patient's name = " + name + ", Patient's illness = " + illness + "]"`;
- a method named *printBills()* that prints the total value of all bills. Use the following as a guide to create this method:
  - create a *total* variable of type double and assign it an initial value of 0.
  - use a for-each loop to iterate over *bills*: for each bill, add the bill's *amount* to the *total*.
  - Then, still within the for-each loop, print the bill to the console using the `println()` method
  - print the *total* value after the loop ends

3. Let's test out your Patient class. In the *main()* method, perform the following tasks:
- create an ArrayList of the Bill type and save it into a variable
- create a new patient with the name `John` and the ArrayList you just created
- set John's illness to `severe cold` and print the patient to the console
- create a new Bill object for John with the amount `99.95` and the date `June 15 2021`
- add the bill to John's list of bills using the appropriate method
- print all of John's bills using the appropriate method

### Test:
Use the test provided. 

#### Sample output:
```
[Patient's name = John, Patient's illness = severe cold]
Billing date: June 15 2021. Bill amount: 99.95
99.95
```