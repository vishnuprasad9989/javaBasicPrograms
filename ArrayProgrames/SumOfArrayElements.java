package ArrayProgrames;
import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {

        System.out.println("Enter How many doyou want ?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
// getting the input from the users
        for(int i=0; i<num; i++){
            System.out.println("Enter element "+(i+1)+" =");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements entered are : ");
// printing the elements which we are entered
        for(int i=0; i<num; i++){
            System.out.print(arr[i]+" ");
        }
         int sum = 0;
        for(int i=0; i<num; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of elements are = "+ sum);

    }
}
