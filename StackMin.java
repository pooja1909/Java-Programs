/* stack min */

import java.util.*;
class StackMin extends Stack<Integer>{

	Stack<Integer> s2 ;

	StackMin(){

		s2 = new Stack<Integer>();	

	}
(
  public void push(int v){

  	if(v <= min()){

  		s2.push(v);

  	}

  	super.push(v);

  }

  public int pop()
  {

  	 int val = super.pop();

  		if(int val == s2.peek()){

  			super.pop();
  		}

  		return val


  }

  public void min(int v){

  		if(s2.isEmpty()){

  		return Integer.MaxInt;
  		}

  		else{

  				return s2.peek();

  		}

  }