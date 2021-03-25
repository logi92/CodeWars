import static org.junit.Assert.*;

public class MainClass {


    public static void main(String[] args) {
        testSomething();
    }

    public static void testSomething() {
        Integer[] args = new Integer[]{1,2};

        Swapper r = new Swapper(args);
        r.swapValues();
        assertEquals("Failed swapping numbers",2,r.arguments[0] );
        assertEquals("Failed swapping numbers",1,r.arguments[1] );
    }

}
class Swapper{
    public Object[] arguments;

    public Swapper(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        args[0] = args[1];
        args[1] = temp;
        arguments = args;
    }
}

