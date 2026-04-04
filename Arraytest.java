class  Arraytest{
    public static void main(String[] args) {
        int num[]= {45,22,89,16,90,33};
        int smallest = num[0];
        int Largest = num[0];

        for(int n: num){
            if(n<smallest){
                smallest = n;
            }
            if(n>Largest){
                Largest = n;
            }   
        }
        
        System.out.println("Smallest Number is : "+smallest);
        
        System.out.println("Largest Number is : "+Largest);
    }
}