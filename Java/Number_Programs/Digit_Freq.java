package Array_Programs;
// Input a Number and check the frequency of each digit in it!
import java.io.*;
class Digit_Freq
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        int n = Integer.parseInt(br.readLine());
        int freq[]=new int[10]; //array for storing frequency of all digits
        for(int i=0; i<10; i++)
            {
                freq[i]=0; //intializing the count of every digit with '0'
            }
 
/*Note: Frequency of digit '0' is stored in freq[0], frequency of '1' in freq[1] and so on*/
 
        System.out.println("Output:");
        System.out.println("===================="); //this is just for styling the look of the output
        System.out.println("Digit\tFrequency");
        System.out.println("====================");
 
        int d;
        while(n>0)
        {
            d=n%10; //extracting digit from the end
            freq[d]++; //increasing the frequency of that digit.
            n=n/10;
        }
            
        for(int i=0; i<10; i++)
            {
                if(freq[i]!=0) //printing only those digits whose count is not '0'
                    System.out.println("   "+i+"\t    "+freq[i]);
            }
        }
    }
