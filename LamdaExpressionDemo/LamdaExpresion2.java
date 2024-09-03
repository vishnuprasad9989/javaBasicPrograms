package LamdaExpressionDemo;

interface Drawable{
    void draw();

}

public class LamdaExpresion2 {
    public static void main(String[] args) {
        int width = 10;

        // With Lamda
        Drawable drawable = ()->{
            System.out.println("Drawing "+width);
        };

        drawable.draw();
    }
}
