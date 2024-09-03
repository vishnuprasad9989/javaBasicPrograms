package LamdaExpressionDemo;

interface Addition{
    int add(int a,int b);

}

public class AdditionOfValues {
    public static void main(String[] args) {
        //Lamda expression with return keyword
        Addition addition =(a, b)->{
            return (a+b);
        };
        System.out.println(addition.add(35,68));

        // without return keyword
        Addition ad =(a,b)->(a+b);
        System.out.println(ad.add(65,35));
    }
}
