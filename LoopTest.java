public class LoopTest {
    public static void main(String[] args) {
        
        // TODO: Print numbers 1 to 5 using for loop
        System.out.print("For Loop: ");
        for(int i=1;i<=5;i++){
            System.out.print( " " + i);
        }
         
        // TODO: Print numbers 1 to 5 using while loop
        System.out.print(" While Loop: ");
        int i = 1;
        while(i<=5){
            System.out.print( " " + i);
            i++;
            
        }

        // TODO: Print numbers 1 to 5 using do-while loop
        
        System.out.print("  Do-While Loop: ");
         i = 1;////variable ek hi bar declare krte hai in same scope only one time declartion of scope and scope is of 
         //public static void main ok
        do{
            System.out.print( " " + i);
            i++;
        }while(i<=5);
    }
}
