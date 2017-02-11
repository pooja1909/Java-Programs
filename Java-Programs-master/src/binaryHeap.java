/*
 * To change this license rooter, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pooja
 */

class Node{
    int item;
    Node left;
    Node right;
    Node(int d){
        item = d;
        left = null;
        right = null;
    }
}
public class binaryHeap {
    
    static Node root;
 
    
    public static CreateBinaryHeap(int arr[])
    {
        
    }
    
    public static void Build_Max_Heap(int arr[])
    {
        
        int heap_size = arr.length;
        
        for(int i = arr.length/2  ; i>=1 ; i--)
        {
            Max_Heapify(arr,i);
        }
    
        
            
    
                }
    
    public static void Max_Heapify(int arr[], int i)
    {
        
        
        
    }
    
    public static int heap_maximum(int arr[])
    {
        return arr[1];
    }
    
    
    
    public static void main(String args[])
    {
        binaryHeap bh = new binaryHeap();
       
        
         bh.root = new Node(4);
         bh.root.left = new Node(5);
         bh.root.right = new Node(6);
         bh.root.left.left = new Node(7);
         bh.root.left.right = new Node(10);
         bh.root.right.left = new Node(14);
         bh.root.right.right = new Node(20);
         bh.root.left.left.left = new Node(35);

         int arr[] = {90, 15, 10, 7, 12, 2, 7,4};
         bh.Build_Max_Heap(arr);
         //BuildMaxBinaryHeap(arr);
         //MaxHeapify(arr,i);
         GetMax(arr);
         GetMin(arr);
         //Insert(element);
         //Extract_Top_Priority(element);
         
    }
    
    
    public static void BuildMaxBinaryHeap(int arr[],int n)
    {
        
    }
    
    
   public static void  MaxHeapify(int arr, int index)
     {
         
     }
   public static void GetMax(int arr[])
         {
             
         }
  public static void GetMin(int arr[])
         {
             
         }
        public static void insert(int arr[],int key)
         {
             
         }
        public static void Extract_Top_Priority(int element)
         {
             
         }
         
}