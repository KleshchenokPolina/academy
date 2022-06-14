package by.academy.lesson2;

public class Cat {
    int age;
    String nickname;
    public void grow(){
        age=age+1;
    }
    public void sleep (){
        System.out.println("Кот спит");
    }
    public void eat (){
        System.out.println("Кот ест");
    }
    public void walk(){
        System.out.println("Кот гуляет");
    }
    public Cat(){
    }
    public Cat(String nickname){
        this.nickname=nickname;
    }
    public void getAge (){
        this.age=age;
    }
    int money;
    public int getMoney (){
        return money;
    }
    public void setMoney (int money){
        this.money=money;
    }
    char initials;
    public char getInitials(){
        return initials;
    }
    public void setInitials(char initials){
        this.initials=nickname.charAt(0);
    }
    boolean




}
