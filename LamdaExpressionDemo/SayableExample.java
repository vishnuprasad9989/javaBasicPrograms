package LamdaExpressionDemo;

interface Say{
    String sayName(String call);
    //int members();

    default void m1(){
        System.out.println("This is default type of method");
    }
}


public class SayableExample {
    public static void main(String[] args) {
        //implementation using Lamda function
       Say say = (call)->{
         return "I have nothing to say ...";
       };
        System.out.println(say.sayName("vishnu"));
    }
}
