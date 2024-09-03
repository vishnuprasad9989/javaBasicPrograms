package java8;

interface Tata {
    default void features(){
        System.out.println("This contains tata features");
    }


}

interface Mahindra {
    default void features(){
        System.out.println("This contains Mahindra features");
    }

}

interface Hyundai {
    default void features(){
        System.out.println("This contains Hyundai features");
    }

}

public class MultipleInherience implements Tata, Mahindra, Hyundai {

    public static void main(String[] args) {
     MultipleInherience multi = new MultipleInherience();
     multi.features();
    }

    @Override
    public void features() {
        Mahindra.super.features();
    }

}


