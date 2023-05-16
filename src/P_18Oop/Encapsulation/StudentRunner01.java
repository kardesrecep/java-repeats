package P_18Oop.Encapsulation;
import  P_18Oop.Encapsulation02.Car;

import P_17constructors.Student;
import P_18Oop.Encapsulation02.Car;

public class StudentRunner01 {

    public static void main(String[] args) {
        Student01 std= new Student01();
//        std.name="Ali";
//        std.surName="Can";
//        std.number=12;

//        std.writeNumber();

        //burda car claassina ulasmak icin yukarida car classinin blundugu pathi import ederek uzun
        //uzun yazmaktan kurtulduk

        Car car1=new Car();
//      car1.brand="Honda";
        //default bir yapi oldugu icin burada baska bir classtan biz erisim saglayamadik


        Student01 std2=new Student01();
        std2.name="Cemal";
        std2.surName="Tan";
        std2.number=456;
        std2.setAge(23);


        std2.writerInf();
        // Student classinda butun degiskenler public olarak atandigi icin degiskenleriiz
        // uzerinde kontrolun saglanmasi zordur
        //bundan dolayi encapsulationu kullanmak gerek
        //=>class icindeki degiskenler private fakat bunlari erisime acmak icnse
        // methodlari public yaparak
        //bu sorunu cozebiliriz












    }
}
