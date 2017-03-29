import java.io.*;
import java.util.*;

class Superstack {
	public static void main(String args[])throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> list = new LinkedList<Integer>();
		int n =  Integer.parseInt(is.readLine());

		while(n > 0){
			String command = is.readLine();
			
			String sp [] = command.split(" ");
		    if (sp[0].equals("PUSH"))
		    {

		        list.addFirst(Integer.parseInt(sp[1]));
		    }
		    else if (sp[0].equals("POP") && list.size() > 0)
		    {
		       
		        list.removeFirst();
		    }
		    else if (sp[0].equals("INC"))
		    {

		        int count = Integer.parseInt(sp[1]);

		        int increment = Integer.parseInt(sp[2]);
		        count = Math.min(list.size(), count);
		        
		        int j = list.size()-1;
		        int p = 0;
		        while(count > p){
		        	int element = list.get(j);
		        	element += increment;
		        	list.set(j, element);
		        	j--;
		        	p++;

		        }
		     }

		    PrintTop(list);
		    n--;
            }
        }

        static void PrintTop(LinkedList stack) {
            if (stack.size() == 0) {       
                System.out.println("Empty");
            }
            else {       
                System.out.println(stack.get(0));
            }
        }
}
