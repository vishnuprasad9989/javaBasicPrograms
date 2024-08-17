package ArrayProgrames;
import java.util.Scanner;

public class ArrayReverseOrder {
    public static void main(String[] args) {

        System.out.println("Enter How many do you want ?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
// getting the input from the users
        for (int i = 0; i < num; i++) {
            System.out.println("Enter element " + (i + 1) + " =");
            arr[i] = sc.nextInt();
        }
        System.out.println("The original elements are : ");
        for(int i=0; i<num; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After reversing all the array elements : ");
        for(int i=num-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
