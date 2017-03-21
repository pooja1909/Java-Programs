//CTCI string problems:
//String has all unique characters: //no additional data structures can be used.
import java.io.*;
class Recur {

	public static void main(String[] args){


		int n= 10;
		System.out.println(display(10));


	}
	public static int display(int n){

		if(n==1) {
			return 1 ;
		}
    else{
			
    		System.out.println(display(n-1));
			return n;

	}
}

}




























































































		

