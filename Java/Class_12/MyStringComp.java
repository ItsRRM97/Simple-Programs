 
//string buffer syntax and demonstation
public class MyStringComp {
 
    public static void main(String x)
    {
        String c = "We are comparing the content with a StringBuffer content";
        StringBuffer sb =
            new StringBuffer(x); //stores a string into an object
        /**
         * We can use contentEquals() method to compare content with a StringBuffer.
         * It returns boolean value.
         */
        if(c.contentEquals(sb)){ //content equals compares the strings
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }
        StringBuffer asb =
            new StringBuffer(x);
        if(c.contentEquals(asb)){
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }
    }
}