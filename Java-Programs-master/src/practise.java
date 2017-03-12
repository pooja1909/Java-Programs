//CTCI string problems:
//String has all unique characters: //no additional data structures can be used.
import java.io.*;
class practise {

	public static void main(String[] args){


		String test[]= {"abcdge","","dhhhasjd","pooe","hhdej", "123abb","yeyhhfnf","abc@hdhed134-56","123@#$"};
		boolean results[] = new boolean[test.length];
		for(int i=0; i < results.length ; i++){
			     if(test[i]=="") System.out.println("invalid input");
	 			results[i] = uniqueChars(test[i]);
	 			if(results[i]==true){
	 				System.out.println("unique string");
	 			}
	 			else{
	 				System.out.println("not unique string");
	 			}
		}	



	}


	static boolean uniqueChars(String s){

	char charSet[] = new char[128]; //ascii values orelse 256

		int i=0;
		while(i < s.length()){
		 char c = s.charAt(i);
		 	if(charSet[c]==1){

		 		return false;
		 		//return flag;
		 	}
		 	else{
		 		charSet[c]++;
		 	}
		 i++;
		}

return true;


	}

}