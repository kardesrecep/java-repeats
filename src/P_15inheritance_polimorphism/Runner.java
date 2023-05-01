package P_15inheritance_polimorphism;

public class Runner {
    public static void main(String[] args) {

        //Inheritance variableler secilirken java objectin data typina bakar
        //oncelikli istediginiz variableyi Objectin data type'i olan Classda arar
        //o classda bulamazsa parentinde arar hicbirinde bulamazsa hata verir

        Cat cat1 = new Cat();
        System.out.println("cat1.a = " + cat1.a);
        System.out.println("cat1.b = " + cat1.b);//34
        System.out.println("cat1.c = " + cat1.c);//145


        Mammal cat2 = new Cat();
        System.out.println("cat2.a = " + cat2.a);


        Animal cat3 = new Cat();
        System.out.println("cat3.a = " + cat3.a);

//obje olustururken objectin data typesi child class olamaz
        //inheritancede methodlar secilirken java const bakar
        // ve istenilen methodu const kullanan classtan alir
       // o classta bulamazssa parente bakar orda da yoksa hata verir
        Cat cat4 = new Cat();
        cat4.eat(); //cat eat
        cat4.drink();//mammal drink

        Mammal cat5 = new Mammal();
        cat5.eat();//mammal eat

        Animal cat6 = new Animal();
        cat6.eat();//animal eat

    }
}
