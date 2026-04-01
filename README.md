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