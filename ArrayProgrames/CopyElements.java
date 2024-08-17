package ArrayProgrames;

public class CopyElements {
    public static void main(String[] args) {

        int[] original = {13,28,79,66,32,54};
        int[] copy = original;

        System.out.println("Before copying elements from an array : ");
        for(int i=0; i<original.length; i++){
            System.out.print(original[i]+"  ");
        }

        System.out.println();

        System.out.println("After copying an elements from an array : ");
        for(int i=0; i<copy.length; i++){
            System.out.print(copy[i]+"  ");
        }
    }
}
