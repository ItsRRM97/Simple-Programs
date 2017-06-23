#include<iostream>
#include<cstdlib>
#include<fstream>
#include<cstring>
#include<stdio.h>
using namespace std;
class passenger;
class ticket
	{
	char source[15], dest[15], doj[7], email[30], phone[11];
	int fnum, dtime, atime, pnr;
	public:
		ticket(char sou[15],char des[15],char d_oj[7],char emai[30],char pho[11],int fnu,int dti,int ati,int p_nr)
			{
			strcpy(source,sou);
			strcpy(dest,des);
			strcpy(doj,d_oj);
			strcpy(email,emai);
			strcpy(phone,pho);
			fnum=fnu;
			dtime=dti;
			atime=ati;
			pnr=p_nr;
			}
		friend void store(ticket t,passenger *p,int n);
	};
class passenger
	{
	char fname[30], lname[30];
	int age;
	public:
		passenger(){}
		passenger (char fnam[30],char lnam[30],int ag)
			{
			strcpy(fname,fnam);
			strcpy(lname,lnam);
			age=ag;
			}
		friend void store(ticket t,passenger *p,int n);
	};
void store(ticket t,passenger *p,int n)
	{
	ofstream out("bookings.txt",ios::app);
out<<"\n"<<t.pnr<<"~\n"<<t.doj<<"\n"<<t.fnum<<"\n"<<t.source<<"\n"<<t.dtime<<"\n"<<t.dest<<"\n"<<t.atime<<"\n"<<t.email<<"\n"<<t.phone;
	for (int i=0;i<n;i++)
		{
		out<<"\n"<<p[i].fname<<"\n"<<p[i].lname<<"\n"<<p[i].age;
		}
	out<<"\n*";
	out.close();
	}
int view(char ref[4])
	{
	char str[30];
	ifstream in("bookings.txt");
	while(!in.eof())
		{
		in>>str;
		if (strcmp(str,ref)==0)
			{
			cout<<"\n ****| TICKET |**** \n Booking reference: "<<str;
			in>>str;
			cout<<"\n Date of Journey (DDMMYY): "<<str;
			in>>str;
			cout<<"\n Flight number: KA-"<<str;
			in>>str;
			cout<<"\n From: "<<str;
			in>>str;
			cout<<"\n At: "<<str<<"hrs";
			in>>str;
			cout<<"\n To: "<<str;
			in>>str;
			cout<<"\n At: "<<str<<"hrs";
			in>>str;
			cout<<"\n Contact email: "<<str;
			in>>str;
			cout<<"\n Contact number: "<<str;
			in>>str;
			for(int i=0;strcmp(str,"*")!=0;i++)
				{
				cout<<"\n\n Passenger "<<i+1<<" details: \n First Name: "<<str;
				in>>str;
				cout<<"\n Last Name: "<<str;
				in>>str;
				cout<<"\n Age: "<<str;
				in>>str;
				}
			cout<<"\n\n ****| TICKET |**** ";
			in.close();
			return(0);
			}
		}
	cout<<"\n Invalid reference number! ";
	}
int book()
	{
	int ch1, ch2, i, j, fnum, dtime, atime, pnr, age, n;
	char source[15], dest[15], doj[7], email[30], phone[11], fname[30], lname[30], ch;
	cout<<"\n Enter the date of journey (DDMMYY) : ";
	cin.ignore();
	cin.getline(doj,7);
	src:
	cout<<"\n\n Enter the source place: \n\n 1. Bhubaneswar \n 2. Bokaro \n 3. Ranchi \n 4. Visakhapatnam \n 5. Patna \n\n Enter your choice: ";
	cin>>ch1;
	switch(ch1)
		{
		case 1:
			strcpy(source,"Bhubaneswar");
			break;
		case 2:
			strcpy(source,"Bokaro");
			break;
		case 3:
			strcpy(source,"Ranchi");
			break;
		case 4:
			strcpy(source,"Visakhapatnam");
			break;
		case 5:
			strcpy(source,"Patna");
			break;
		default:
			cout<<"\n Invalid selection! ";
			goto src;
		};
	dst:
	cout<<"\n\n Enter the destination place: \n\n 1. Bhubaneswar \n 2. Bokaro \n 3. Ranchi \n 4. Visakhapatnam \n 5. Patna \n\n Enter your choice: ";
	cin>>ch2;
	switch(ch2)
		{
		case 1:
			strcpy(dest,"Bhubaneswar");
			break;
		case 2:
			strcpy(dest,"Bokaro");
			break;
		case 3:
			strcpy(dest,"Ranchi");
			break;
		case 4:
			strcpy(dest,"Visakhapatnam");
			break;
		case 5:
			strcpy(dest,"Patna");
			break;
		default:
			cout<<"\n Invalid selection! ";
			goto dst;
		};
	if (ch1==ch2)
		{
		cout<<"\n\n ERROR: The source and destination cannot be same! Enter again! ";
		goto src;
		}
	for (i=0;i<6;i++)
		{
		for (j=0;j<6;j++)
			{
			if (i==ch1 && j==ch2)
				{
				fnum=1000+(ch1*10)+ch2;
				dtime=1000+(ch1*100)+ch2;
				atime=dtime+230;
				pnr=dtime+atime;
				}
			}
		}
	cout<<"\n Enter the contact details for the itinery: \n\n E-mail: ";
	cin.ignore();
	cin.getline(email,30);
	cout<<"\n Phone: ";
	cin.getline(phone,11);
	ticket t(source,dest,doj,email,phone,fnum,dtime,atime,pnr);
	passenger *p;
	cout<<"\n How many passengers are travelling on this trip? :";
	cin>>n;
	p=new passenger[n];
	for (i=0;i<n;i++)
		{
		cin.ignore();
		cout<<"Enter passenger "<<i+1<<" details: \n First Name: ";
		cin.getline(fname,30);
		cout<<"\n Last Name: ";
		cin.getline(lname,30);
		cout<<"\n Age: ";
		cin>>age;
		p[i]=passenger(fname,lname,age);
		}
	cout<<"\n Your booking is complete! \n\n Booking Reference: "<<pnr<<endl;
	store(t,p,n);
	return(0);
	}
int cancel(char ref[4])
	{
	char str[30];
	ifstream in("bookings.txt");
	ofstream out("temp.txt",ios::trunc);
	while(!in.eof())
		{
		in>>str;
		if (strcmp(str,ref)==0)
			{
			while(strcmp(str,"*")!=0)
				in>>str;
			in>>str;
			}
		out<<str<<"\n";
		}
	remove("bookings.txt");
	rename("temp.txt","bookings.txt");
	}
int main()
	{
	int ch;
	char ref[5];
	fstream f("bookings.txt",ios::trunc);
	f.close();
	menu:
	cout<<"\n\n ****| KIIT AIRLINES RESERVATION SYSTEM |**** \n\n\n 1. Book a ticket \n 2. View a ticket \n 3. Cancel a ticket \n 4. Exit \n\n Enter your choice: ";
	cin>>ch;
	switch(ch)
		{
		case 1:
			book();
			goto menu;
		case 2:
			cout<<"\n Enter the booking reference: ";
			cin>>ref;
			strcat(ref,"~");
			view(ref);
			goto menu;
		case 3:
			cout<<"\n Enter the booking reference: ";
			cin>>ref;
			strcat(ref,"~");
			cancel(ref);
			goto menu;
		case 4:
			exit(0);
		default:
			cout<<"\n Invalid Selection! ";
			goto menu;
		}
	return(0);
	}
