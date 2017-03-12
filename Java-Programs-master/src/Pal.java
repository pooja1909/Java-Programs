import java.io.*;
import java.util.*;
class Pal {

	public static void main(String[] args){


		
		 String s = "tacoa";
		 boolean flag = isPerm(s);
		 if(flag){

		 	System.out.println("yes");
		 }
		 else{

		 	System.out.println("No");
		 }
	}

	public static boolean isPerm(String s){

		  int table[] = buildFreqTable(s);
		 for(int i =0; i < table.length; i++){
		 	System.out.print(table[i]);
		 }

		 return checkMaxOdd(table);

		  //return
	}


	public static boolean checkMaxOdd(int table[]){

		boolean foundOdd = false;
		for(int count : table){

			if(count % 2 == 1){

				if(foundOdd){
					return false;
				}
					foundOdd = true;
			
			}

		}

		return true;

	}


   public static int getCharValue(Character c){

   			int a = Character.getNumericValue('a');
   			int z = Character.getNumericValue('z');
   			int val = Character.getNumericValue(c);
   			if(a <= val &&  val <= z){
   				return val-a;
   			}

   			return -1;
   }


	public static int[] buildFreqTable(String s){

		int table[] = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		//char phase[] = s.toCharArray();
		for(char c: s.toCharArray()){

			int value = getCharValue(c);

			if(value!=-1){
				table[value]++;
			}

		}

		return table;
	}


}
