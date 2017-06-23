node * concatenate (node *head1, node *head2)
{
    node *p;
    if (head1==NULL)                            //if the first linked list is empty
                            return (head2);
    if (head2==NULL)                            //if second linked list is empty
                                return
(head1);
               
                p=head1;                             //place p on the first node of the first linked list
               
                while (p->next!=NULL)                 //move p to the last node
                                p=p->next;
                p->next=head2;                           
				//address of the first node of the second linked list stored in the last node of the first linked list
                return
(head1);
}
