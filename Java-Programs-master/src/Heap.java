/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pooja
 */
public class Heap {
   
            
           int arr[] = {90, 15, 10, 7, 12, 2, 7,4};
           int count = arr.length-1;
            int capacity;
             String heap_type;
             /*
          public Heap(int capacity, String heap_type)
             {
                 this.capacity = capacity;
                 this.heap_type = heap_type;
                 this.count = 0;
                 this.arr = new int[capacity];
             }
             */
          
          
          public int parent(int i)
                  {
                      
                      if(i <= 0 || i >= count) return -1;
                      return i-1/2;
                  }
          public int left(int i)
          {
             int left= 2*i+1;
             if(left >= count)return -1;
             return left;
              
          }
          public int right(int i)
          {
              int right = 2*i+2;
              if(right >= count) return -1;
              return right;
          }
                  
          
          public static void main(String args[]){
             
             Heap hp = new Heap();
            int x = hp.parent(3);
            System.out.println(x);
            int l = hp.left(4);
            System.out.println(l);
            int r = hp.right(5);
            System.out.println(r);
            
        }
        
        
    
    
    
}
