

public class basic {
    public static void main(String[] args) {
        //A class is a named grp of properties and functions

        //store 5 nos

        int[] arr= new int[5];

        //store 5 names
        String[] names= new String[5];

        //Now i want to store Student details that have their Name, Marks
        //how can we create a datatype for this??--> we use class   

        Student[] students= new Student[5];
       //Student student1;//here i declareed. but it has not reffered to any object
        Student studentone;
        
        // studentone.rollno=1;
        // studentone.marks=34.5f;
        // studentone.names="Abc";


        //creating object using constructor
         Student one=new Student(12,"name",65.5f);
        
         
        }

    //create class
    static class Student{
        int rollno;
        String names;
        float marks;
//its like a template. imaginary
//object is an instance of the class. physical
//instance variables are the variabels in the object eg: 14,name, 54.5 is an object
//fro student these rae instance variable
        Student(int rollno,String names,float marks){
            this.names=names;
            this.marks=marks;
            this.rollno=rollno;
        }
    }
}
