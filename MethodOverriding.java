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

public class Methodoverriding {
    public static void main(String[] args) {
        A obj = new B();  // parent reference, child object
        obj.show();       // decides at runtime → Class B
    }
}


// so the diffrence is that the it is assigned while runing the code   A obj = new B(); like Class B will be printed here
