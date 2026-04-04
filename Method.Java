class addition {
   void  add(int a, int b ){
    
    System.out.println(a + b);

   }


}

public class Method
{
    public static void main(String args[])
    {   
        int a = 10;
       int b = 20;
        addition obj = new  addition( );
        obj.add ( a, b);
    }
}