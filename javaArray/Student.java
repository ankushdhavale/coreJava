import java.util.*;

class Human{
    private int age;
    String name;

    public int getAge(){
        return age;
    }
}

public class Student 
{
    public static void main(String args[])
    {
       Human hu = new Human();
       int age = hu.getAge();
       hu.name = "Ankush";
       System.out.println(hu.name + " " + age);
    }    
}


