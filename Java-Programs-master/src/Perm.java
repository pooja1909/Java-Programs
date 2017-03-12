import java.io.*;
import java.util.*;
class Perm {

	public static void main(String[] args){


		String s1= "efgh";
		String s2 = "dcba";
		
		boolean flag = Isperm(s1,s2);
		if(flag){

			System.out.println("Strings are permutations0");
		}
		else{

			System.out.println("Strings are not permutations");

		}

	}

	public static boolean Isperm(String s1, String s2){



			if(s1.length()!=s2.length()) return false;


			int letters[] = new int[128];

			for(int i=0 ; i < s1.length(); i++){

				letters[s1.charAt(i)]++;
			}

			for(int j=0; j <s2.length() ; j++){

				letters[s2.charAt(j)]--;

				if(letters[s2.charAt(j)]<0){
					return false;
				}
			}

	return true;


	}

/*
	public static String sort(String s){

		char input[] = s.toCharArray();
		Arrays.sort(input);
		return new String(input);


	}
*/

}
