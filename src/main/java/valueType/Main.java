package valueType;

public class Main {
    public static void main(String[] args) {





        // Numune 1
        int sayi1 = 12;
        int sayi2 = 56;
        sayi1  = sayi2 ; // sayi1 = sayi2-in qiymeti
        sayi2 = 98; // sayi2 deyissede bunun sayi1-e dexli olmur
        System.out.println(sayi1); // 56



        // Numune 2
        int number = 100;
        System.out.println(number);
        change(number);
        System.out.println(number);

    }


     // Numune 2
    static void change(int number){
        System.out.println("inside before : " + number);
        number = 200;
        System.out.println("inside after  : " + number);
    }
}
