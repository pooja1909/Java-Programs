import java.io.*;
import java.util.*;
class Edits {

	public static void main(String[] args){


		String s1= "bale";
		String s2 = "pale";
		
		boolean flag = IsEditsAway(s1,s2);
		if(flag){

			System.out.println("Strings are one edits away");
		}
		else{

			System.out.println("Strings are not one edits away");

		}

	}

	public static boolean IsEditsAway(String s1, String s2){


			if(Math.abs(s1.length()- s2.length())>1)return false;


			String first = s1.length()<s2.length()? s1: s2; //shorter length
			String second = s1.length()< s2.length()? s2: s1; //longer length

			int index1=0;
			int index2 = 0;
            boolean foundDiff = false;
			while(index1 < first.length() && index2 < second.length()){


				if(first.charAt(index1)!= second.charAt(index2)){


					
					if(foundDiff) return false;

					foundDiff = true;


					if(first.length()== second.length()){

						index1++;
					}


				}

				else{

					index1++; //if matching move the pointer for the shorter string
				}


					index2++; // always move the pointer for the longer string.
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
