package stringExample;

public class Main {
    public static void main(String[] args) {


        String sehir1 = "Istanbul";
        String sehir2 = "Izmir";
        sehir1 = sehir2;
        System.out.println(sehir1==sehir2);
        System.out.println(sehir1.equals(sehir2));
        sehir2 = "Bursa";
        System.out.println(sehir1);
        System.out.println(sehir2);




        // String s = new String("fenerbahce");
        String s = "fenerbahce";
        System.out.println(s);
        change(s);
        System.out.println(s);


    }

    public static void change(String s){
        System.out.println("inside before :  " + s);
        s="galatasaray";
        System.out.println("inside after  : " + s);
    }





}
