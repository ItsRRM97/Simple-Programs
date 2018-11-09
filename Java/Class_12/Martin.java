class Martin {
    public static void main() {
        Martin obj = new Martin();
        String s="ThisisRoshanisRoshan";
        String name="roshan";
        int n = obj.numOfTerrorists(s,name);
        System.out.println(n);
    }
    int numOfTerrorists(String text, String name)
    {
        text=text.trim();
        int count =0;
        String sub=""; name=name.trim();
        int i;
        int len = text.length();
        int lname = name.length();
        System.out.println(len);
        System.out.println(lname);
        int gotill = len-lname;
        for(i=0;i<=(len-lname);i++) {
            sub = text.substring(i,lname+i);
            System.out.println(sub);
            if(sub.equalsIgnoreCase(name)) {
                count++;
            }
            else {
                continue;
            }
        }
        return count;
    }
}