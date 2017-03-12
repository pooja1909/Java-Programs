/*Union of two lists
intersection of two lists:
Input:
   List1: 10->15->4->20
   lsit2:  8->4->2->10
Output:
   Intersection List: 4->10
   Union List: 2->8->20->4->15->10*/

class Linkedlist{
	
Node head;

   class Node
   {
    Node next;
    int data;
   Node(int data){

   	this.data = data;
   	next= null;

   }

   }
   void getUnion(Node head1, Node head2){

      Node list1 = head1;
      Node list2 = head2;

      while(list1!=null){
      		push(list1.data);
      		list1 = list1.next;
      }
      while(list2!=null){

        if(!isPresent(head,t2.data));
        {
          push(list2.data);
        }

        list2 = list2.next;
      }
   }

   voi getintersection(Node head1, Node head2){
    Node result = null;
    Node l1 = head1;

      while(l1!=null){

         if(isPresent(head2, t1.data))
         {
          push(t1.data);
         }
         t1 = t1.next;
      }

   }

   void print(){

     Node temp = head;
     while(temp!=null){

      System.out.println(temp.data);
      temp = temp.next;
     }
   }

   boolean isPresent(Node head, int data){

    Node l = head;
    while(l!=null){

       if(l.data==data)
          return true;

       l = l.next;
    }

   return false;
   }
public static void main(String args){
	

	Linkedlist list1 = new Linkedlist();
    Linkedlist list2 = new Linkedlist();
    LinkedList unin = new LinkedList();
    LinkedList intersecn = new LinkedList();

     llist1.push(20);
        llist1.push(4);
        llist1.push(15);
        llist1.push(10);
        llist2.push(10);
        llist2.push(2);
        llist2.push(4);
        llist2.push(8);

        intersecn.getIntersection(llist1.head, llist2.head);
        unin.getUnion(llist1.head, llist2.head);
        llist1.printList();
 
 		llist2.printList();
}

}