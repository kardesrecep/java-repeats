package P_18Oop.class_lab03;

public class DogRunner {
    public static void main(String[] args) {
        Dog gumus= new Dog();
        gumus.genus="Sivas Kangali";
        gumus.size=Dimension.LARGE;
        gumus.age=3;

        gumus.eat();
        gumus.sit();
        gumus.bark();
        gumus.sleep();

        //gercekten dunyadaki yapilari javaya aktardik
        //nesnelerin ozelliklerini degisken yapabildiklerini ise method olarak tanimlamak gerek

    }
}
