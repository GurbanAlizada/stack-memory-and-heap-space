package javaPassByValue;

public class Main {
    public static void main(String[] args) {


        /*
        User user1 = new User("Barca");
        User user2 = new User("Real madrid");
        System.out.println(user1);
        System.out.println(user2);
        User value = user1;
        user1 = user2;
        user2 = value;
        System.out.println(user1);
        System.out.println(user2);
*/




/*
        User user1 = new User("Barca");
        User user2 = new User("Real madrid");
        System.out.println(user1);
        System.out.println(user2);
        change(user1 , user2);
        System.out.println(user1);
        System.out.println(user2);
*/


        User u = new User("alma");
        System.out.println(u);
        foo6(u);
        System.out.println(u);


    }

    static void foo6(User u){
        System.out.println(u);
        u.name = "limon";
        u  = new User("armud");
        System.out.println(u);
        u.name="armud 2";
        System.out.println(u);
    }


    static void change(User alma , User armud){
        System.out.println("inside before "+alma);
        System.out.println("inside before "+armud);
        User limon = alma;
        alma = armud;
        armud = limon;
        System.out.println("inside after "+alma);
        System.out.println("inside after "+armud);

    }


}
