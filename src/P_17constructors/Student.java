package P_17constructors;

public class Student {

    /*
    1- Sinif ismi ile ayni olmalidirlar
    2-Return typleri yoktur
    3- Parametre alabilirler
    4- abstract/static/final ve synchronized olamazlar
    5-overload edilebilirler
     */
    String name;
    String surName;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student (String a, String b, int y){
        name=a;
        surName=b;
        age=y;
    }

}
