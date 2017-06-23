/* Sparse Matrix representation using linked list */
#include <stdio.h>
#include <stdlib.h>

typedef struct list{
int rows, cols, value;
struct list *next;
}list;

list *create(){
list *temp = (list *)malloc(sizeof(list));
if(temp==NULL){
printf(“nMemory Allocation Error !”);
exit(1);
}
return temp;
}

list *makenode(int r, int c, int val){
list *temp = create();
temp->rows = r;
temp->cols = c;
temp->value = val;
temp->next = NULL;
return temp;
}

list *insert(list *head, int r, int c, int val){
list *ptr, *temp = head;
if(head == NULL){
head = makenode(r,c,val);
}
else{
while(temp->next != NULL)
temp = temp->next;
ptr = makenode(r,c,val);
temp->next = ptr;
}
return head;
}

void display(list *head){
list *temp;
if(head == NULL){
printf(“nList is empty.”);
exit(1);
}
temp = head;
while(temp != NULL){
printf(“(%d,%d,%d->)->”,temp->rows,temp->cols,temp->value);
temp = temp->next;
}
printf(“bb “);
}

int main(){
int arr[3][4],i,j,m,n,ct=0;
list *head = NULL;
for(i=0; i<3; i++){
printf(“nEnter the values for row %d?”, i+1);
for(j=0;j<4;j++){
scanf(“%d”,&arr[i][j]);
if(arr[i][j] != 0)
ct++;
}
}
head = makenode(3,4,ct);
for(i=0;i<3;i++){
for(j=0;j<4;j++){
if(arr[i][j] != 0)
head = insert(head,i,j,arr[i][j]);
}
}
printf(“nList representation of Sparse Matrix is: n”);
display(head);
getch();
}
