#include<stdio.h>
#include<stdlib.h>
int main()
{
FILE *fp,*tp;
char ch;
fp = fopen("id.c", "r");
tp=fopen("ram.c","w");     
 	
    while( (ch=getc(fp))!=EOF)
    {
   if(ch>64 && ch<91 && ch>96 && ch<123)
     //printf("%c",ch);
     putc(ch,tp);
     
    }
   
    fclose(fp);
    fclose(tp);
   
    
   
    
    return 0;


}

