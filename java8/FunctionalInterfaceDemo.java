package java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    //SAM Interface (singal abstract method)
    public abstract void singleMethod();

    //from java 8 onwords we can declare default methods also
    default void executable(){
        System.out.println("we can declare and execute default method in java interface");
    }

    //we can also declare static interface in java interface
    static void m1(){
        System.out.println("this is an static method");
    }

   // public abstract void m2();
}


class TestFunctionalInterface implements FunctionalInterfaceDemo{

    @Override
    public void singleMethod() {
        int a=10, b=20, c;
        c = a+b+30;
        System.out.println(c);
    }

   /* @Override
    public void m2() {

    }*/

    public static void main(String[] args) {
        TestFunctionalInterface test = new TestFunctionalInterface();
        test.singleMethod();

    }
}
