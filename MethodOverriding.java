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