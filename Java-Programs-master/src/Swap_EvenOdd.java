/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pooja
 */
public class Swap_EvenOdd {
    public static void main(String args[])
    {
       int arr[] = {12, 34, 45, 9, 8, 90, 3};
       segregate_even_odd(arr);
       System.out.print("Array after segregation ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    
    public static void segregate_even_odd(int arr[])
    {
        int left = 0;
        int right = arr.length-1;
        
        while(left < right)
        {
            if(arr[left]%2==0 && left<right)
                left++;
            if(arr[right]%2==1  && left< right)
                right--;
            if(left<right)
            {
                int temp = arr[left];
               arr[left]= arr[right];
               arr[right] = temp;
               left++;
               right--;
            }
            
            
            
        }
    }
}
