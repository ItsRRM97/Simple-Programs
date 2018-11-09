 
 class QueueArray implements Queue
 {
 int arr[], rear, front;
 public QueueArray(int size)
 {
 if(size <= Stack.MAX)
 {
 arr = new int[size];
 rear = front = -1;
 }
 else System.err.println("Exceeded maximum array size!");
 }

 public void push(int x)
 {
 if(rear == -1)
 {
 rear = front = 0;
 arr[rear] = x;
 }
else
 {
 if(rear >= arr.length - 1) System.err.println("Array OVERFLOW!");
 else arr[++rear] = x;
 }
 }

 public int pop()
{
if(front > rear) rear = front = -1;
 if(front < 0) System.err.println("Array UNDERFLOW!");
 else return arr[front++];
return -1;
}

 public void display()
 {
 for(int i = front; i <= rear; i++) System.out.print(arr[i] + " ")
;
}
 }

 interface Queue
 {
public static final int MAX = 2147483639; //Maximum elemts an array can have

 public void push(int x);

 public int pop();

 public void display();
 }
