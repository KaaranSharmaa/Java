*********************************************************************************************************

You → Write Java Code (.java) → Compile (javac) → Bytecode (.class) → JVM → OS → Hardware → Output
You write code
→ File ends with .java
Compiler (javac)
→ Converts .java → .class (called bytecode)
→ This is NOT machine code yet
Bytecode (.class)
→ Platform-independent (can run anywhere)
JVM (Java Virtual Machine)
→ Converts bytecode → machine code
→ Executes your program
OS + Hardware
→ JVM interacts with OS → OS runs on hardware → you see output

*********************************************************************************************************
JShell = Java Shell
JShell → Direct Execution → No main() needed → Instant Output
for example 3+5 it will give 8 no need to make full code 

*********************************************************************************************************

JAVA IS STRONGLY TYPED LANGUAGE WHICH means that i have to give it tpye for example 

class Hello
{
    public static void main(String a[])
    {
        System .out.println("3+5");
        System .out.println(3+5);
         System .out.println('d');


    }
}

Compile 
PS C:\Users\K\Java> java hello.java
3+5
8
d

*********************************************************************************************************
Data Type
Data Type Size Range Example
byte 1 byte -128 to 127 byte b = 100;
short 2 bytes -32,768 to 32,767 short s = 3000;
int 4 bytes -2^31 to 2^31 - 1 int i = 123489;
long 8 bytes -2^63 to 2^63 - 1 long l = 123456789L;
Data Type Size Range Example
float 4 bytes ±3.40282347E+38F float f = 3.14f;
double 8 bytes ±1.79769313486231570E+308 double d = 3.14159;
char 2 bytes 0 to 65,535 (Unicode) char c = 'A';
boolean 1 bit true or false boolean flag = true;

class DataType{
    public static void main(String a[]);
    {
        int num1 = 9;  // Example: I can put a number in an int
        byte b = 127;  // Example: byte can store values like 127
        short sh = 558;  // Example: short holds numbers like 558
        long l = 5854L;  // Example: long for large numbers like 5854
        float f = 5.8f;  // Example: float needs decimal numbers with 'f'
        double d = 5.8;  // Example: double stores decimal numbers
        char c = 'k';  // Example: char stores a single character
        boolean b = true;  // Example: boolean is true or false

        Sysytem.out.println()
    }
}



public class Exercise {

  public static void main(String[] args){
        int age = 25;
        double height = 5.9;
        String name = "Alex";
       System.out.print("Name:"+ name  +",Age:" + age +",Height:"+ height );
     
       
  }
}
*********************************************************************************************************
class TypeConversion
{
    public static void main(String args[])
    {
        //byte b = 125;
        int a = 257;
        byte k = (byte) a;

        float f = 5.6f;
        int t = (int) f;

        System.out.println(t);
    }
}

******************************************************************************************************
Arthametic operator

int res = num1 + num2;
System.out.println(res); // Output: 12
● Addition (+): Adds two operands.
● Subtraction (-): subtracts the second operand from the first.
● Multiplication (*): Multiplies two operands.
● Division (/): Divides the first operand by the second, giving the quotient.
● Modulus (%) : Returns the remainder after division.
Example: modulus operation
int num1 = 26;
int num2 = 5;
int res = num1 % num2;
System.out.println(res); // Output: 1
In this example, 26 % 5 equals 1 because 26 divided by 5 is 5 with a remainder
of 1.

c++ => post increment it will fist fecth the value then it will increment it (If it is applied with the assigmnet operator)
++c => pre increment it will first incremt thge value then assign it( If it is applied with the assigmnet operator)
******************************************************************************************************
Realtional opertor
implementation:
Equality (==): Checks if two values are equal.
Inequality (!=): Checks if two values are not equal.
Greater than (>): checks if the left operand is greater than the right operand.
Less than (<): Checks if the left operand is less than the right operand.
Greater than or equal to (>=): Checks if the left operand is greater than or
equal to the right operand.
Less than or equal to (<=): Checks if the left operand is less than or equal to the
right operand.

******************************************************************************************************
Realation 

AND (&&)

👉 True only when both are true

T && T → T
T && F → F
F && T → F
F && F → F
✅ OR (||)

👉 True if at least one is true

T || T → T
T || F → T
F || T → T
F || F → F
✅ NOT (!)

👉 Reverses the value

!T → F
!F → T
******************************************************************************************************
else if
if (condition1) {
 // code to execute if condition1 is true
} else if (condition2) {
 // code to execute if condition2 is true
} else {
 // code to execute if all conditions are false
}

******************************************************************************************************
ternary
condition ? result_if_true : result_if_false;

******************************************************************************************************
Switch in prograoming s is small
class Switch
{
    public static void main(String args[]){
        int n = 9;
        switch(n){
                     case 1:{
                    System.out.println("Monday");
                    break;
                    }
                    case 2:{
                        System.out.println("Tuesday");
                        break;
                    }
                    case 3:{
                        System.out.println("Wednesday");
                        break;
                    }
                    case 4:{
                        System.out.println("Thrusday");
                        break;
                    }
                    case 5:{
                        System.out.println("Friday");
                        break;
                    }
                    case 6:{
                        System.out.println("Saturday");
                        break;
                    }
                    case 7:{
                        System.out.println("Sunday");
                        break;
                    }
                    default:{
                        System.out.println("Wrong Input");
                        break;
                    }
        }
    }
}

TEST

public class Exercise {
   public static void main(String[] args) {
       
        int score = 75;

        if(score > 50){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        
        if(score < 60){
            System.out.println("Grade: D");
        }
        else if(score >= 60 && score <= 74){
            System.out.println("Grade: C");
        }
        else if(score >= 75 && score <= 89){
            System.out.println("Grade: B");
        }
        else if(score >= 90){
            System.out.println("Grade: A");
        }
   }
}

******************************************************************************************************
While loop 
int i = 0; // Initialize counter variable
while (i < 4) { // Loop continues while i is less than 4
 System.out.println("Hi");
 i++;}

 ******************************************************************************************************
Do while
public class Main {
 public static void main(String[] args) {
 int i = 1;
 do {
 System.out.println(i);
 i++;
 } while (i <= 4);
 }
}
In this example:
 The variable i is initialized to 1.
 The do block contains the code to print the value of i and increment it by 1.
 The loop continues to run while i <= 4. As a result, numbers from 1 to 4 are printed.
 Even if i was initially greater than 4, the message would still print once because the condition
is checked after the code block execution.

******************************************************************************************************
For loop;
// Example 1: Printing "Hi" with indices
 for (int i = 0; i <= 4; i++) {
 System.out.println("Hi " + i);
 }
******************************************************************************************************
length() – This gives you the total number of characters in the string.
charAt(index) – It returns the character at the specified position (index) in the string.
equals(anotherString) – This checks if two strings are exactly the same, including uppercase and lowercase differences.
equalsIgnoreCase(anotherString) – This checks if two strings are the same, ignoring differences between uppercase and lowercase.
toLowerCase() – This converts the entire string to lowercase letters.
******************************************************************************************************
Java Classes
● A class in Java is a blueprint for creating objects. It defines common
behaviors and properties shared by all objects of that class. Classes are
user-defined data types that act as templates for objects.
Java Objects
● An object in Java is an instance of a class. It is a basic unit of
Object-Oriented Programming and represents real-life entities.
******************************************************************************************************
Arrays
int nums[]={1,2,3}
int a[]= new int[3]// bydeafualt if we print all the value will be zero
int  num [][]=new int[3][4] here 3 means number of arrays and 4 mens number of column in array
******************************************************************************************************
Strign is used to store the data character dat we will apply " " to store the data 
string is muttable immutable by deafult which means cant be change by cant be change its mean that once a memory is allocated then it wont edit if we want to edit it it will take new space in heap memory and old data and combine them and use then the old string data it will cleared by garbage collector 

string name ="Karan";
name.char(index:1)
******************************************************************************************************
String buffer basically string buffer is the method which is muttable which can be change by that we means that while at the creation of the time it will take the extra space of 12 byte so that it will be eassy to append;
******************************************************************************************************
encapsulation basicaly bindin of data with method with a help of obj is know as encapsultaion

*************************************************************************************************
constructer basically it is a type of method only which is same name as of class and it dont return anythink
you dont need to call them bydefault they are called when you create object but no visible
basically it is used whn you want want to define all over valur at intial it will take 0 or null but if you want to define somwthink then we use constructor

********************************************************************************************************
parmterized constructor basically in which we pass parmter
Default in which we dont pass parameter

********************************************************************************************************
The static keyword in Java is primarily used for memory management. It can be applied to
variables, methods, blocks, and nested classes. The static keyword belongs to the class itself
rather than to instances of the class, meaning
When you declare a variable as static, it is known as a static variable. A static variable is used
to refer to the common property of all objects of a class (which is not unique for each object),
such as the company name of employees, or the college name of students.
• The static variable gets memory only once in the class area, at the time of class
loading
********************************************************************************************************
A static block in Java is a block of code associated with the static keyword. This block is
used for the static initialization of a class and is executed only once when the class is loaded
into memory for the first time. Unlike other code blocks, a static block runs before any object
of the class is created and even before the constructor is called.
********************************************************************************************************

NAming convencen 

Classes and Interfaces: The first letter is uppercase. For example: Thread, Runnable,
Reflection, Collections.
● Methods: Start with a lowercase letter, with subsequent words capitalized. For
example: concat(), toString(), wait(), notify().
● Constants: Written in all uppercase letters, often with words separated by underscores.
For example: PIE, SUNDAY, MAX_VALUE.

********************************************************************************************************
A obj =new A();

till now we have think that this line crate the object but no only 
new A(); 
this line crreates the objects ok and this are know as anonymous object 
butr the issue is you cant reuse them
********************************************************************************************************
method overriding means i fdefins same method in two diffrend classes and they have used inherintnce then it will use the last one method by last oen i mean that child class will be priportie ok for example
class A{
    public void print1(){
        System.out.println("in class A");
    }
}
class B extends A{
    public void print1(){
        System.out.println("in class B");
    }

}

class MethodOverriding{
    public static void main(String[] args) {
        B obj = new B();
        obj.print1();

        
    }
}

********************************************************************************************************
Package 
it is basically a folder in which we can the classes to make it look good and oragan zied now how to calll inside the package 
import tools.calc;
import tools.Advn calc;

there is one more method of using * where all the file will called rather then caling them one by one

import tools.*;
********************************************************************************************************
Acces modifier
| Access Level                   | Private | Protected | Public | Default |
| ------------------------------ | ------- | --------- | ------ | ------- |
| Same class                     | Yes     | Yes       | Yes    | Yes     |
| Same package subclass          | No      | Yes       | Yes    | Yes     |
| Same package non-subclass      | No      | Yes       | Yes    | Yes     |
| Different package subclass     | No      | Yes       | Yes    | No      |
| Different package non-subclass | No      | No        | Yes    | No      |
********************************************************************************************************
polymorphism 
poly means many morphism means behaviour

there are wo type of polymorphism 
1)runtime ploymorphism -: its behaviour is defined at the runtime of th program 
example method overriding -: 
class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new B();  // parent reference, child object
        obj.show();       // decides at runtime → Class B
    }
}
    

2)Compile time polymorphism-:its define whilr the complile time   
     Exapmle method overloading  add(int a,int b);
                                add(int a,int b,int c);                               

