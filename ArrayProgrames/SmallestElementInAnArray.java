package ArrayProgrames;

import java.util.Scanner;

public class SmallestElementInAnArray {
    public static void main(String[] args) {

        int arr[] = {121,241,65,89,12,667,354,33};
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The Smallest number in array is  "+min);

    }
}
