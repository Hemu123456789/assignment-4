
// Java program to Demonstrate the HashMap() constructor

// Importing basic required classes
import java.io.*;
import java.util.*;

// Main class
// To add elements to HashMap
class HASHMAP;
{

	// Main driver method
	public static void main(String args[])
	{
		// No need to mention the
		// Generic type twice
		HashMap<Integer, String> hm1 = new HashMap<>();
		// Adding elements using put method
		// Custom input elements
		hm1.put(1);
		hm2.put(2);
		hm3.put(3);
		hm4.put(4);
		hm5.put(5);
		hm6.put(6);
    hm7.put(7);
		hm8.put(8);
    hm9.put(9);
		hm10.put(10);
    hm11.put(5);
		hm12.put(12);
    hm13.put(5);
		hm14.put(14);
    hm15.put(15);
		

		System.out.println("VAalues square of key are : "
						+ A1);
	}
}

public static int[] sortedSquares(int[] A) {
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        int[]A1=new int[A.length];
        int u=0;
        for(int i=0;i<A.length;i++)
        {   
             h.put(A[i],(int) Math.pow(A[i],2));
             for (Map.Entry<Integer,Integer> entry : h.entrySet())
             {
                 A1[u]=entry.getValue();
                 u++;
             }
             h.remove(A[i]);
         }
         Arrays.sort(A1);
        return A1;
