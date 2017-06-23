
class Alpha
{
  public static void main(String Se)
  {
      char ac[]= new char[Se.length()]; int j; char temp;
      char ch; int i; String sd=Se.toUpperCase(); String ss="";
      for(i=0;i<Se.length();i++)
      {
          ch=sd.charAt(i);
          ac[i]=ch;
        }
        for(i=0;i<=sd.length()-1;i++)
        {
            for(j=0;j<ac.length-1;j++)
            {
                if(ac[j]>=ac[j+1])
                {
                    temp=ac[j+1];
                    ac[j+1]=ac[j];
                    ac[j]=temp;
                }
            }
        }
        for(i=0;i<sd.length();i++)
        {
            ss=sd+ac[i];
            ss=ss.trim();
        }
        System.out.println(ss);
    }
}

        
      