package P_14accesmodifiers_inheritance.Animal;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat cat1=new Cat();
        cat1.eat();
        cat1.drink();
        cat1.meow();

        System.out.println("*******************************************");

        Dog dog1=new Dog();
        dog1.eat();
        dog1.drink();
        dog1.bark();

        System.out.println("*******************************************");

        Bird bird1= new Bird();
        bird1.eat();
        bird1.drink();
        bird1.tweet();




/*
        1)"Inheritance" sayesinde
        a-code tekrarindan kurtuluruz
        b-code tamiri(maintance)kolay olur
        c-child classlari daha atomic yapmis oluruz

        2) Bir classi baska bir classin child classi yapmak icin "extends" keywordunu
        kullaniriz. Ilk yazilan class child 2. yazilan parent class olur

        3)child class objectleri parent classtan method ve variableleri kullanabilirler

        4) parent class objectleri child classtan method ve variableleri kullanamazlar
        5)Object class her classin parentidir
        6)private method ve variableler child classlar tarafindan kullanilamazlar
        => protected method ve variableler child claass tarafindan kullanilabilir
        => default method ve variableler  ayni packagedeki child claass tarafindan kullanilabilir
        => public method ve variableler child claass tarafindan kullanilabilir

         Note:Child classlar tarafin kullanilabilir olmak demek "inherit" olmak demektir


      7) 4 tip inheritance vardir
      a-Multivel inheritance: Java bunu kabul eder
      b-Hierarchical inheritance: Bir parent icin coklu child/ java kabul eder
      c-Multiple inheritance :  Bir child icin coklu parent java kabul etmez
      (java does not multiple inheritance)
      d-Singleton inheritance :  Bir child icin bir parent/ java kabul eder


 */





    }
}
