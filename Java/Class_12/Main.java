public class Main
{
	public static void main(String[] args) 
	{
	    String str= "today was a good day";
	    str = str + " "; //add a blank space
	    int i,j,k; String s="";
	    char ch[]= str.toCharArray(); //converting the sentence to char array
	    int l=ch.length; //length of the char Array
	    for(i=0;i<l;i++)
	    {
	        if(ch[i]!=' ')
	        {
	            s=s+ ch[i];
	        }
	        else
	        {
	            char ss[]=s.toCharArray();
	            int len=ss.length;
	            char temp;
	            //arrange the words alphabetically
	            for(j=0;j<len;j++)
	            {
	                for(k=0;k<len;k++)
	                {
	                    if(ss[j]<ss[k])
	                    {
	                        temp=ss[j];
	                        ss[j]=ss[k];
	                        ss[k]=temp;
	                    }
	                }
	            }
	            String m=new String(ss);
	            System.out.print( m + " ");
	            s= ""; //should be null not a blank space, right?        
	        }
	    }
	}
}