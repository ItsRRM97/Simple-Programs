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
                int x[10],i,max,min;
                float avg;
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
                  char ch[10];
                  int len=sizeof(struct sockaddr);
                   printf("enter numbers\n");
                   for(i=0;i<10;i++)
                   {
                    scanf("%d",&x[i]);
                    sendto(fd,&x[i],4,0,(struct sockaddr*)&server, sizeof(struct sockaddr));
                    recvfrom(fd,ch,sizeof(ch),0,(struct sockaddr*)&server,&len);
                    printf("%d is %s\n",x[i],ch);
                   }
                   
                   
                
                    
}


