package ArrayProgrames;

public class LargestElementFromAnArray {
    public static void main(String[] args) {

        int [] num = {25,36,256,121,69,287,72};
        int largest = num[0];

        //by using for each loop
        for(int i : num){
            if(largest < i){
                largest = i;
            }
        }
        System.out.println("The largest number in an array  =  "+ largest);
    }
}
