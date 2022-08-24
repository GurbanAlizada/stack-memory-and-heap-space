package outOfMemory;

public class Main {
    public static void main(String[] args) {

        /*
        int [] error = new int[999999999];

        for(int i = 0 ; i <999999999 ; i++){
            error[i] = i;
        }
*/

        Integer [] error = new Integer[999999999];
        for (int i = 0 ; i < 999999999 ; i++){
            error[i] = i;
        }


    }
}
