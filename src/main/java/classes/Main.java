package classes;

public class Main {
    public static void main(String[] args) {


        User user1 = new User("alma");  //user1 =  111
        User user2 = new User("armud"); //user2 =  112
        user1 = user2; // user1 = 112
        user2.name="limon"; // 112.name = "limon";
        System.out.println(user1.name); // 112.name.sout






        User user = new User();  // user 812
        System.out.println(user.age);  // 812.age
        change(user); // 812
        System.out.println(user.age);


    }


    public static void change(User user){ // 812
        System.out.println("inside before   : " + user.age); // 812
        user.age=123; // 812
        System.out.println("inside after   : " + user.age);

    }




}
