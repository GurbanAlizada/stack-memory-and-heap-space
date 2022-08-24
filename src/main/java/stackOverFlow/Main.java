package stackOverFlow;

public class Main {
    public static void main(String[] args) {

        foo();

    }
    public static String foo(){
        System.out.println("Hello world");
        return foo();
    }

}
