import java.util.*;
class Stack{
	
 	public static void main(String args[])
	{
		int popElem;
		ArrayList<Stack> SetofStacks = new ArrayList<Stack>();
		push();
		popElem = pop();
	}

	public void push(int v){

		Stack last= getlastStack();
		if(last!=null && !last.isFull()){
			last.push(v);
		}else{

			Stack newstack = new Stack(capacity);
			newstack.push(v);
			SetofStacks.add(newstack);
		}

	}

	int void pop(){

		Stack last = getlastStack();
		if(last==null) throw EmptyStackException();
		int v = last.pop();

		if(last.size == 0) SetofStacks.remove(SetofStacks.size()-1);
		return v;

	}

}