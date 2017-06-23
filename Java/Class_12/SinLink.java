package Class_12;

 class SinLink
 {
 Node start, penlast, last;

 public SinLink()
 {
start = null;
 last = null;
 penlast = null; //penultimate node
 }

 public void insert(int x)
 {
 if(start == null) start = new Node(x, null);
 else if(start.link == null)
 {
 start.link = new Node(x, null);
 penlast = start;
 last = start.link;
 }
 else
 {
 last.link = new Node(x, null);
 penlast = last;
 last = last.link;
 }
 }

 public void delete(int x)
 {
 if(start == null) return;
 if(start.data == x) start = start.link;
 else if(last.data == x)
 {
 last = penlast;
 last.link = null;
 }
 else
 {
 Node prev = null, point = start;
 while(point != null)
 {
 if(point.data == x) prev.link = point.link;
 prev = point;
 point = point.link;
 }
 }
 }

 public void traverse()
 {
 Node point = start;
 while(point != null)
 {
 System.out.print(point.data + "->");
 point = point.link;
 }
 System.out.print("null");
 }

 public void reverse()
 {
 Node point = start; String rev = "";
 while(point != null)
 {
 rev = Integer.toString(point.data) + "->" + rev;
 point = point.link;
 }
 System.out.print(rev + "null");
 }

 public int search(int x)
 {
 Node point = start; int i = 0;
 while(point != null)
 {
 if(point.data == x) return i;
 point = point.link;
 i++;
 }
 return -1;
 }
 }

 class Node
 {
 Node link;
 int data;

 public Node(int data, Node link)
 {
 this.data = data;
 this.link = link;
 }
 }
