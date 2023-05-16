package P_18Oop.Encapsulation;

public class Student01 {
    public int number = 10;

    public String name;
    public String surName;
    public int age;


   private void writeNumber() {
        System.out.println(number);
    }

    public void writerInf(){
        System.out.println("name = " + name);
        System.out.println("surName = " + surName);
        System.out.println("number = " + number);
        System.out.println("age = " + age);
    }
   public void setAge(int y){
    if (y>0){
        age=y;

    }else {
        System.out.println("Yas degeri 0dan kucuk olamaz");
    }
    }


}
