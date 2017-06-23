package Mix_Programs;

import java.io.*;
class Temperature
{
   void Convert()throws IOException
   {
       BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
       System.out.println("Enter Temperature in Celcius");
       double c=Double.parseDouble(br.readLine());
       double f=(1.8*c)+32;
       System.out.println("Temperature in Fahrenheit is="+f);
    }
}
