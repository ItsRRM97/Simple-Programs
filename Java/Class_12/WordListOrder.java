class WordListOrder
{
    public int canArrangeWords(String[] arr) {
        int len = Integer.parseInt(arr[0]); //no of words in the array
        int i,j;
        int lenwrd; //to store the length of each word from the array
        char fl[] = new char[len]; //char array to store the first letter of each word
        char ll[] = new char[len]; //char array to store the last letter of each word
        for(i=0;i<len;i++) {
            lenwrd = arr[i+1].length();
            fl[i] = arr[i+1].charAt(0);
            ll[i] = arr[i+1].charAt(lenwrd-1);
    }
    int count = 0;
    // fl and ll should have atleast len-1 matching elements for the logic to hold true
        for(i=0;i<len;i++) {
            for(j=0;j<len;j++) {
                if(fl[i]==ll[j]) {
                    count++;
                    break;
                }
            }
        }
        if(count==len-1) { return 1; }
        else { return -1; }
    }
    public static void main() 
    {
        String a[]={"4","dsgsge","bdsddgc","adgb","csegsd"};
        WordListOrder obj = new WordListOrder();
        int c=obj.canArrangeWords(a);
        System.out.println(c);
    }
  }