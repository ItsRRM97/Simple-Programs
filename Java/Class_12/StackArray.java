 

 class StackArray implements Stack
 {
 int arr[], top;
 public StackArray(int size)
 {
 if(size <= Stack.MAX)
 {
 arr = new int[size];
 top = -1;
 }
 else System.err.println("Exceeded maximum array size!");
 }

 public void push(int x)
 {
 if(top >= arr.length - 1) System.err.println("Array OVERFLOW!");
 else arr[++top] = x;
 }

 public int pop()
 {
 if(top < 0) System.err.println("Array UNDERFLOW!");
 else return arr[top--];
 return -1;
 }

 public void display()
 {
 for(int i = top; i >= 0; i--) System.out.print(arr[i] + " ");
 }
 }

 interface Stack
 {
 public static final int MAX = 2147483639; //Maximum elemts an array c

public void push(int x);
 public int pop();
 public void display();
 }
