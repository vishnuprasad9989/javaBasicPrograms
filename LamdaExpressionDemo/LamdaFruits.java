package LamdaExpressionDemo;

interface Fruits{
    int price(int mangos, int apples, int bananas);

}
public class LamdaFruits{
    public static void main(String[] args) {

        //Lamda Expression
        Fruits fruits = (int mangos, int apples, int bananas)->{
            System.out.println("Price of an 1kg mangos are : "+mangos);
            System.out.println("Price of an 1dougen apples are : "+apples);
            System.out.println("Price of an 1dougen bananas are : "+bananas);
            return 0;
        };

        fruits.price(150,280,60);
    }
}
