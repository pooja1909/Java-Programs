/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pooja
 */
import java.io.*;
public class Greatest {
    public static void main(String args[])
    {
        int arr[] = {16, 17, 4, 3, 5, 2};
        nextGreatest(arr);
        
        System.out.println("The modified array:");
        printArray (arr);
    }
    
    public static void nextGreatest(int arr[])
    {
        
        int size = arr.length;
        int max_element_right = arr[size-1];
        
        arr[size-1] = -1;
        for(int i= size-2 ; i >= 0 ; i--)
        {
            int temp = arr[i];
            arr[i] = max_element_right;
            
            if(max_element_right < temp)
                
                max_element_right = temp;
        }
    }
    
    public static void printArray(int arr[])
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]);
        }
    }
}
