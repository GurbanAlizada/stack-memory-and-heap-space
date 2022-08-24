package stringExample;

public class StringPool {
    public static void main(String[] args) {


        String s1 = "Alma";
        String s2 = "Alma";
        String s3 = "Alma";
        String s4 = new String("Alma");

        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));



    }
}
