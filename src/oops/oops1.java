package oops;
import java.util.*;
public class oops1 {
    public static void main(String[] args) {


        student s1= new student();
        s1.rno = 12;
        s1.name = "Mihir";
        s1.marks = 98;

        student s2 = new student();
        s2.rno = 31;
        s2.name = "Mihi";
        s2.marks = 9;

        student s3 = new student();
        s3.rno = 23;
        s3.name = "xyz";
        s3.marks = 45;

        student students[] = new student[3]; // object array
        
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println((students[i].name + ":" + students[i].marks));
        }
        //LHS exec in compile time and RHS exec in runtime
        //new exec dynamically

//        Student.name = "Mx";
//        Student.rno = 1;
//        Student.marks =98.5F;
//        System.out.println(Student.percentage); // print the default one
//        Student.greeting();
//        int a = 4;
//        int b =5;
//
//        swap(a,b);
//        System.out.println("value of " + a+" "+ b);
//        final exampleoffinal Katrina = new exampleoffinal("Kareena");
//        Katrina.name = "other name";

        // When a non primitive is final , you cannot reassign it
       // Katrina = new exampleoffinal("Kareena");
    }
    static void swap(Integer a , Integer b){   // refernce value cannot be swap
        //FINAL IS  A KEYWORD THAT IS USES TO
        Integer temp = a;
        a=b;
        b=temp;
    }
}

class exampleoffinal{
    final int num = 10;

    public exampleoffinal(String name) {
        this.name = name;
    }

    String name;

}

    class student {
        int rno; // default value is 0
        String name; // is null   #String is Class
        int marks; // is 0.0
        double percentage = 12;
            //we neeed one word to access every object that is this keyword



        // to access the object in the template or class this keyword is
        //to provide that functionality
        student(){
            this.rno = 13;  //this is used to specify
            this.marks = 32;
            this.name = "MD";
        }

        void greeting(){
            System.out.println(this.rno);
        }

        void changeName(String newname){
            name = newname;  // name will now take value of new name
        }

    }



//A package is just a folder , It helps in organising similar data in different folder
//If the files in the same package it don't need to import its easy bitchh

