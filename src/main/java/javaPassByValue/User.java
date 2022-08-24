package javaPassByValue;

public class User {

     String name;
     int age = 1;
     static String phone;


    public User() {
    }

    public void foo(){
        System.out.println("foo");
    }

    public static void foo2(){
        System.out.println("foo2");
    }


    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
