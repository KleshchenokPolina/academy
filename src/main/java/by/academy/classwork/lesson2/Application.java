package by.academy.classwork.lesson2;

public class Application {
    public static void main(String[] arg) {
     Cat cat1=new Cat();
     Cat cat2=new Cat("Valusha");

     cat2.eat();
     cat2.sleep();
     cat2.walk();

     cat1.age=2;
     cat1.grow();
     cat1.grow();
     cat1.grow();

     cat1.setMoney(2);
     cat2.setInitials();
     cat2.setisHomeAnimal();








    // System.out.println(age);
     //int catAge = cat1.getAge();

    // System.out.println(catAge);

    }
}

