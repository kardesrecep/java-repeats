package P_17constructors;

public class Driver {

    int x;

    public Driver (){
       // System.out.println("constructor");
        x=12;

    }


    public static void main(String[] args) {

  Driver driver= new Driver();
      //  System.out.println(driver.x);

        Student std= new Student("Ali", "Can", 15);
        System.out.println(std.name);
        System.out.println(std.surName);
        System.out.println(std.age);

        System.out.println("****************************************************************");
        Student std2= new Student("Baki",  22);
        System.out.println(std2.name);
        System.out.println(std2.surName);
        System.out.println(std2.age);

    }
}
