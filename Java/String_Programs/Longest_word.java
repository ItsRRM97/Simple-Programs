package String_Programs;

// my own logic for extracting the longest word in a sentence!!!!!!!!!!!!!
class Longest_word
{
public static void main(String a)
{
String v=""; String lo="";
a=a+" ";
char ch;
int i;
int min=0;
int count=0;
int l=a.length();
for(i=0;i<l;i++)
{
ch=a.charAt(i);
if(ch!=32)
{
count++;
v=v+ch;
}
else
{
if(lo.length()<=v.length())
{
min=count;
lo=v;
}
count=0;
v="";
}
}
System.out.println("The longest word==="+lo);
System.out.println("The no...=="+min);
}
}




    

   