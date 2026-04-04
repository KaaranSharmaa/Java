class addition {
    public int add(int a,int b){
       System.out.println("the addition of a and b :");
        return(a+b);


    }
}
class substraction {
    public int sub(int a, int b){
        System.out.println("the substraction of a and b :");
        return(a - b);
    }
}
class multiplication {
    public int mul(int a, int b){
        System.out.println("the multiplication of a and b :");
        return(a * b);
    }
}

class Calculator{
    public static void main(String arg[]){
        int a = 10;
        int b =20;
        addition obj = new addition();
        substraction obj2 = new substraction();
        multiplication obj3 = new multiplication();
        
        obj2.sub(a, b);
        obj3.mul(a, b);
        obj.add(a,b);

     
    }
}