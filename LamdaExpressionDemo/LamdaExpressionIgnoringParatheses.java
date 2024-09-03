package LamdaExpressionDemo;

interface Caller{
    public String callerName(String name);
}

public class LamdaExpressionIgnoringParatheses {
    public static void main(String[] args) {
        // using lamda
        Caller call1 = (name)-> {
         return "Hello "+name;
        };
        System.out.println(call1.callerName("ajay"));

        // By ignoring parantheses
        Caller call2 = name -> {
            return "hii "+name;
        };
        System.out.println(call2.callerName("durga"));
    }
}
