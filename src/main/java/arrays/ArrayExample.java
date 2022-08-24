package arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int [] sayilar1 = {1,2,3,4,5};  // sayilar1 = 111
        int [] sayilar2 = {6,7,8,9};   // sayilar1 = 112
        sayilar1  = sayilar2;  // sayilar1 = 112
        sayilar2[0] = 99;  // 112[0] = 99
        System.out.println(sayilar1[0]); // 112[0]
        // OUTPUT : 99



        int [] array = {1,2,4,5,6}; // 112
        System.out.println(array[0]); // 112[0]
        change(array); // 112
        System.out.println(array[0]);


    }

    public static void change(int [] array){  // 112
        System.out.println("inside before "+array[0]);
        array[0]=598; // 112[0] = 598;
        System.out.println("inside after " + array[0]);
    }


}
