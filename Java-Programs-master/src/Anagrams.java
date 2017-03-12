
/*
[
['eat','tea','ate'],
['tan','nat'],
['bat']
]*/

import java.io.*;
import java.util.*;
class Anagrams{


	public static void main(String args[]){

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = {"eat","tea","ate","tan","nat","bat"};
		List<List<String>> list = new ArrayList<List<String>>();
		HashMap<String,ArrayList<String>> hm = new HashMap<String, ArrayList<String>>(); // store the sorted key string and value as list of anagrams;

			char tempArray[];
		for(String s: input){
			tempArray = s.toCharArray();
			Arrays.sort(tempArray);
			String str= new String(tempArray);
			if(hm.containsKey(str)){
				hm.get(str).add(s);
			}
		    else{
		    ArrayList<String> al = new ArrayList<String>();
            al.add(s);
            hm.put(str, al);
           }
		}
			
			list.addAll(hm.values());
		 	System.out.println(list);
	}



}