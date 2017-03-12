import java.io.*;
import java.util.*;
class Space {

	public static void main(String[] args){


		
		 String s = "Mr John Smith    ";
		 System.out.println(s.length());
		 char s1[] = s.toCharArray();
		 int index=0;
		 for(int i=s.length()-1; i > 0; i--){
		 	if(s.charAt(i)!=' '){

		 		index = i;
		 		break;
		 	}

		 }

		 int truelength = index+1;

		replaceSpaces(s1,truelength);
	}

	public static void replaceSpaces(char s1[], int truelength){

			int spaceCount=0;
			int index1=0;
			int i=0;
			for(i=0 ; i < truelength; i++){
				if(s1[i]==' '){
					spaceCount++;
				}
			} // gettingg the spacecount in first scan.

			index1 = truelength + spaceCount*2;
			System.out.println(index1);
			if(truelength < s1.length) s1[truelength] = '\0';
			for(int j = truelength-1; j >= 0 ; j--){
				if(s1[j] == ' ')
				{
					s1[index1-1]= '0';
					s1[index1-2]= '2';
					s1[index1-3]= '%';
					index1 = index1-3;
				}
			else{
				s1[index1-1]= s1[j];
				index1--;
				}

				System.out.println(new String(s1));
			}

	}

/*
	public static String sort(String s){

		char input[] = s.toCharArray();
		Arrays.sort(input);
		return new String(input);


	}
*/

}
