package com.Arrays;
import java.util.Random;  
public class ShufflingAnArray{  
    public static void main(String[] args) {  
        // Sample array of integers  
        int[] array = {1, 2, 3, 4, 5};  
        // Shuffle the array  
        shuffleArray(array);  
        // Print the shuffled array  
        for (int num : array) {  
            System.out.print(num + " ");  
        }  
    }  
    public static void shuffleArray(int[] array) {  
        Random rand = new Random();  
        for (int i = array.length - 1; i > 0; i--) {  
            // Generate a random index between 0 and i (inclusive)  
            int j = rand.nextInt(i );  
             //System.out.println(j);
            // Swap the elements at indices i and j  
            int temp = array[i];  
            array[i] = array[j];  
            array[j] = temp;  
        }  
    }  
}  
