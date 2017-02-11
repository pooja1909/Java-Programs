/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pooja
 */
public class Conse {
    
   public static void main(String args[])
   {
       int a[] = {79,78,80,82,81,76};
     int n = a.length;
       
      boolean flag = findConse(a,n);
      if(flag==true)
          System.out.print("the numbers are consecutive");
      else
          System.out.print("the numbers are not consecutive");
   }
   
   
  public static boolean findConse(int a[], int n){
      
      while(n < 1)
          return false;
      
      int max= findMax(a,n);
      
      int min = findMin(a,n);
      
      while(max-min+1 == n){
          for(int i =0; i < n ; i++)
          {
              int j ;
             
              
              if(a[i]<0)
                  j = -a[i]-min;
              else
                  j = a[i]-min;
              
              
              
              if(a[j]>0)
                  a[j]=-a[j];
              else
                  return false;
            
          }
          return true;
      }
      
      
      return false;
   }
  
  //utility functions
 public static int findMax(int a[], int n){
      
     int max_num = Integer.MIN_VALUE;
     for(int i = 0 ; i < n ; i++)
         if(a[i]> max_num)
             max_num = a[i];
     
     
     return max_num;
      
  }
  
  
 public static int findMin(int a[], int n)
  {
       int min_num = Integer.MAX_VALUE;
     for(int i = 0 ; i < n ; i++)
         if(a[i]< min_num)
             min_num = a[i];
     
     
     return min_num;
  }
}
