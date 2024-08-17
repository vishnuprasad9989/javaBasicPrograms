package ArrayProgrames;

public class LargestElement {
    public static void main(String[] args) {

        int[] num = new int[6];
        int max = 0;

        num[0] = 25;
        num[1] = 32;
        num[2] = 10;
        num[3] = 07;
        num[4] = 89;
        num[5] = 47;

        for(int i=0; i<num.length; i++){
            if(num[i] > max)
               max = num[i];
        }
        System.out.println("The largest number is = "+max);
    }
}
