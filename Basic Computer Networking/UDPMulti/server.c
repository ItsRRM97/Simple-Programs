#define PORT 8888   //The port on which to listen for incoming data
 
int main()
{
 
    SOCKET s;
    struct sockaddr_in serverSocket, clientSocket;
 
	char receiveBuffer[1000];
	//int receiveBufferLength=1000;
    int clientSocketLength;
	int recv_len;
 
    clientSocketLength = sizeof(clientSocket) ;
   	
	WSADATA wsa; 
	//Initialise winsock
    printf("\nInitialising Winsock...");
    if (WSAStartup(MAKEWORD(2,2),&wsa) != 0)
    {
      printf("Failed. Error Code : %d",WSAGetLastError());
        exit(EXIT_FAILURE);
    }
    printf("Socket Initialised.\n");
 
    //Create a socket
    if((s = socket(AF_INET , SOCK_DGRAM , 0 )) == INVALID_SOCKET)
    {
        printf("Could not create socket : %d" , WSAGetLastError());
    }
    printf("Socket created.\n");   
 
    //Prepare the sockaddr_in structure
    serverSocket.sin_family = AF_INET;
    serverSocket.sin_addr.s_addr = INADDR_ANY;
    serverSocket.sin_port = htons( PORT );
	
	//Bind
    if( bind(s ,(struct sockaddr *)&serverSocket , sizeof(serverSocket)) == SOCKET_ERROR)
    {
        printf("\nBind failed with error code : %d" , WSAGetLastError());
        exit(EXIT_FAILURE);
    }
    printf("Bind done\n\n");
 
    //keep listening for data
 
	while(1)
	{
        printf("\n\t\t\tWaiting for data...\n");
        fflush(stdout);
        //receiveBuffer[2000]=NULL;
	
        if((recv_len = recvfrom(s, receiveBuffer, 1000, 0, (struct sockaddr *) &clientSocket, &clientSocketLength)) == SOCKET_ERROR)
        {
            printf("\n\nrecvfrom() failed with error code : %d" , WSAGetLastError());
            //exit(EXIT_FAILURE);
			while(1);
        }
 
        //print details of the client/peer and the data received
        printf("\n\nReceived packet from %s:%d\n", inet_ntoa(clientSocket.sin_addr), ntohs(clientSocket.sin_port));
        printf("\nClient Says: " );
			printf(receiveBuffer,recv_len);
 
    
 
        //now reply the client with the same data
        if (sendto(s, receiveBuffer, recv_len, 0, (struct sockaddr*) &clientSocket, clientSocketLength) == SOCKET_ERROR)
        {
            printf("\nsendto() failed with error code : %d" , WSAGetLastError());
           // exit(EXIT_FAILURE);
			while(1);
        }
		else
			printf("\nMessage Sent Back to Client");
 
    }
 
    closesocket(s);
    WSACleanup();
    return 0;
 
}
