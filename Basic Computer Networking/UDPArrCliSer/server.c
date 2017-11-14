#include<stdio.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<netinet/ip.h>
#include<arpa/inet.h>
#include<stdlib.h>
#include<string.h>

void main()
{ 
                int x[10];
                int fd= socket (AF_INET,SOCK_DGRAM,0); 
                if(fd==-1)
                 {
                      printf("SOCKET CREATION ERROR\n");
                      exit(0);
                 }
                 struct sockaddr_in  server , client;
                 server.sin_family=AF_INET; 
                 server.sin_port=3551;
                 server.sin_addr.s_addr=INADDR_ANY;
                 int b=bind(fd,(struct sockaddr*)&server, sizeof(struct sockaddr));
                 if(b==-1)
                    {
                         printf("SOCKET BINDING ERROR \n");
                         exit(0);
                     }
                  char ch[5];
                  int i;
                   for( i=0;i<10;i++)
                   {
                   int len=sizeof(struct sockaddr);
                   int k;
                   recvfrom(fd,&k,4,0,(struct sockaddr*)&server,&len);
                   x[i]=k;
                   if(x[i]%2==0)
                   strcpy(ch,"even");
                   else 
                  strcpy(ch,"odd");
                   sendto(fd,ch,sizeof(ch),0,(struct sockaddr*)&server, sizeof(struct sockaddr));
                   printf("%d is %s\n",x[i],ch);
                   }
                  
                   
}
