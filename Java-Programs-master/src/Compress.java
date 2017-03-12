import java.io.*;
import java.util.*;
class Compress {

	public static void main(String[] args){


		String s1= "bc";
		
		String compressed = compress(s1);
		System.out.println(compressed);

	}

	public static String compress(String s1){


			int countConsecutive=0;
			StringBuilder result = new StringBuilder();

			for(int i=0; i < s1.length() ; i++){
	
					countConsecutive++;

			if(i+1>= s1.length() || s1.charAt(i)!=s1.charAt(i+1)){
					result.append(s1.charAt(i));
					result.append(countConsecutive);
					countConsecutive = 0;

			}


		}

			return result.length() < s1.length() ? result.toString() : s1;



	}

/*
	public static String sort(String s){

		char input[] = s.toCharArray();
		Arrays.sort(input);
		return new String(input);


	}
*/

}
