import java.io.*;


LinkedListNode findintersection(LinkedListNode list1, LinkedListNode list2){

		Result result1 = gettailandsize(list1);
		Result result2 = gettailandsize(list2);

		if(result1.tail != result2.tail){

			return null;
		}

		LinkedListNode shorter = result1.size < result2.size ?result1 : result2; 
		LinkedListNode longer = result1.size < result2.size? result2 : result1;


		longer = getKthNode(longer, Math.abs(result1.size - result2.size));

	while(shorter!=longer){

		shorter =shorter.next;
		longer = longer.next;
	}

	return longer;

}


class Result{



	public int size ;
	public LinkedListNode tail;

  Result(LinkedlistNode tail,int size){

  	this.size = size;
  	this.tail = tail;

  }


 Result gettailandsize(Node list){


  	if(list ==null) return null;
  		
  	Node current= list;
  	int size =1;

  	while(current.next!=null){

  		size++;
  		current = current.next;

  		}

  		return new Result(current, size)

  		}

  LinkedlistNode getKthNode(LinkedListNode longer, int k){

  		while(k>0 && longer!=null){

  			current = current.next;
  			k--;
  		}

  	return current;
  }

}




