/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pooja
 */
import java.util.*;
import java.util.HashMap;
public class arr_ll {
    
    public static void main(String args[])
    {
        int smallest;
       int arr1[] = {1, 5, 10, 20, 40, 80};
       int arr2[] = {6, 7, 20, 80, 100};
       int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
       int arr4[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
       int arr5[] = {1, 5, 3, 4, 2};
       int arr6[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
      int arr7[] = {1, 5, 3, 4, 2};
       
       
       HashMap<Integer,Integer>
      
       
       
       
       HashSet<Integer> hs = new HashSet<Integer>();
       for(int i = 0 ; i < arr4.length ; i++){
           hs.add(arr4[i]);
           
       }
       
          //  System.out.print(hs);
       
      
      
       
   //  Common_Elements(arr1,arr2,arr3);
     //  Distinct_Elements(arr4);
            
      //      push_zeros(arr6);
            for(int i = 0 ; i < arr6.length ; i++)
            {
                System.out.print(arr6[i]);
            }
            
           int val = Distinct_diff(arr7,3);
    }
    
    public static void Common_Elements(int arr1[], int arr2[], int arr3[]){
        for(int i=0; i < arr3.length;i++)
        { 
            for(int j=0;  j <arr1.length;j++)
         
            {
               
               for(int k=0;  k <arr2.length;k++) {
                    if(arr3[i]==arr1[j] && arr1[j]==arr2[k]){
                        System.out.println(arr3[i]);
                       
                    }
                    
                }
            }
        }
        
    } 
       public static void push_zeros(int arr6[]){
           int counter = 0;
            for(int i=0; i < arr6.length ; i++)
           if(arr6[i]!=0)
               arr6[counter++]=arr6[i];
           
           while(counter < arr6.length)
               arr6[counter++]=0;
       
            
            
        }
      
          
       
    }
    

    

