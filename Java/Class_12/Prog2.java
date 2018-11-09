class Prog2
{
    public static void main()
    {
        String sub="hey";
        String duh="hey there buddy, how are you doing?";
        int len = duh.length();
        int lsub = sub.length();
        int i; int flag = 0;
        String str = "";
        for (i=0; i<len; i++) {
            str = duh.substring(i,lsub);
            if(str.equals(sub)) {
                System.out.println("It is present");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("It is not present");
        }
    }
}
                