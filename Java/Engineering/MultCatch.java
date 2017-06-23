class MultCatch
{  
   public static void main(String args[]){  
    try{  
    int a[]=new int[5]; 
    a[4]=2/0;
    a[5]=30/10;  
   }  
   catch(ArithmeticException e)
   {
       System.out.println("Division by Zero Excepotion");
   }  
   catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Array Out Of Bounds Exception Caught");
    }  
   catch(Exception e)
   {
       System.out.println("common task completed");
    }  
   finally
   {
       System.out.println("rest of the code...");
   }
 }  
}  