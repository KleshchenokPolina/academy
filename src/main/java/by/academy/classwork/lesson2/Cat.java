package by.academy.classwork.lesson2;

public class Cat {
    public int age;
    String nickname;
    double money;
    char initials;
    boolean isHomeAnimal;

    public void grow(){
        age=age+1;
        System.out.println("Cat is growing. Cat's age is "+age+" years.");
    }
    public void sleep (){

        System.out.println("Cat is sleeping");
    }
    public void eat (){

        System.out.println("Cat is eating");
    }
    public void walk(){

        System.out.println("Cat is walking");
    }
    public Cat(){
    }
    public Cat(String nickname){
        this.nickname=nickname;
        initials=nickname.charAt(0);
    }

    public double getMoney (){
        return money;
    }
    public void setMoney (double money) {
        this.money=money;
        System.out.println("Cat's money is "+money+ " dollars");
    }

    public char getInitials(){
        return initials;
    }
    public void setInitials(){
        this.initials=nickname.charAt(0);
        System.out.println("Cat's initials is "+initials+".");
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }
    public void setisHomeAnimal (){
        this.isHomeAnimal=isHomeAnimal;
        System.out.println(isHomeAnimal);
    }
}
