class Prog1
{
    public static void main() {
        String str = "This is the input string I will extract the vowels out from";
        String lcase = str.toLowerCase();
        String nw = "";
        char ch;
        int i;
        int len = lcase.length();
        for( i = 0; i < len; i++)
        {
            ch = lcase.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                continue;
    }
    else {
        nw = nw + ch;
}

}
System.out.println(lcase);
System.out.println(nw);
}
}