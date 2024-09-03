package LamdaExpressionDemo;

interface Lamda1{
    void fast(int speed, String name);

}
public class SimpleLamda {
    public static void main(String[] args) {

        Lamda1 lamda = (int sp, String na)->{
            System.out.println("Car running Speed: "+sp+"km / hr  "+"name of car is "+na);
        };

        lamda.fast(200,"buggati");
    }
}
