#include<iostream>
#include<stack>
using namespace std;

// queue data structure using two stacks
class queue {
private :
   stack<int> s1, s2;
public  :
   void enqueue(int element);
   int dequeue();
   void displayQueue();
};

// enqueue an element to the queue
void queue :: enqueue(int element) {
   s1.push(element);
}

// dequeue the front element
int queue :: dequeue() {
   // transfer all elements of s1 into s2
   while (!s1.empty()) {
      s2.push(s1.top());
      s1.pop();
   }
   // pop and store the top element from s2
   int ret = s2.top();
   s2.pop();
   // transfer all elements of s2 back to s1
   while (!s2.empty()) {
      s1.push(s2.top());
      s2.pop();
   }
   return ret;
}

//display the elements of the queue
void queue :: displayQueue() {
   cout<<"\nDisplaying the queue :-\n";
   while (!s1.empty()) {
      s2.push(s1.top());
      s1.pop();
   }
   while (!s2.empty()) {
      cout<<s2.top()<<" ";
      s1.push(s2.top());
      s2.pop();
   }
}

// main
int main() {
   queue q;
   q.enqueue(5);
   q.enqueue(11);
   q.enqueue(1);
   q.enqueue(7);
   q.enqueue(13);
   q.enqueue(11);
   q.displayQueue();
   int dq_element = q.dequeue();
   cout<<"\nAfter dequeing :-";
   q.displayQueue();
   cout<<endl;
   return 0;
}