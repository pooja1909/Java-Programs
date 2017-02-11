/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pooja
 */
import java.util.Arrays;
import java.util.HashMap;

public class Hashing {

    public static void main(String args[]) {

       // HashSet<Integer> hs = new HashSet<Integer>();
        int arr7[] = {1, 5, 3, 4, 2, 3, 4, 1, 2, 2, 2, 2, 2, 3, 4};
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
     //  union_func(arr1,arr2);
        //  int val = Max_Repeat(arr7,6);
        //    System.out.println(val);

        /*
         for(int i = 0 ; i < arr7.length; i++)
         {
         hs.add(arr7[i]);
         }
       
         hs.toArray();
         */
      //  Arrays.sort(arr7);        
        /*
         for (int i = 0; i < arr7.length; i++) {
         System.out.println(arr7[i]);
         }
         */
        int val = Diff(arr2, 10);
        System.out.print(val);
    }

    public static int Diff(int arr1[], int k) {
        int count = 0;
        int max = Integer.MAX_VALUE;
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int j = 0; j < arr1.length; j++) {
            hm.put(arr1[j], true);
        }

        for (int j1 = 0; j1 < arr1.length; j1++) {
            int x = arr1[j1];
            if ((x - k) >= 0 && hm.get(x - k) == Boolean.TRUE) {
                count++;
            }
            if ((x - k) <= max && hm.get(x + k) == Boolean.TRUE) {
                count++;
            }
            hm.put(x, false);
        }

        return count;
    }

    public static int Max_Repeat(int arr7[], int k) {
        for (int i = 0; i < arr7.length; i++) {
            arr7[(arr7[i] % k)] += k;
        }

        int max = arr7[0], index = 0;
        for (int j = 0; j < arr7.length; j++) {
            if (arr7[j] > max) {
                max = arr7[j];
                index = j;
            }
        }

        return index;
    }

}
