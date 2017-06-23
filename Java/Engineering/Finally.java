class Finally
{
   public static void main(String args[]){  
    try{  
    int a[]=new int[5]; 
    a[5]=30/10;  
   }
   catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Array Out Of Bounds Exception Caught");
    }
   finally
   {
       System.out.println("The Finally Block always gets executed");
       System.out.println("rest of the code...");
   }
 }  
}  