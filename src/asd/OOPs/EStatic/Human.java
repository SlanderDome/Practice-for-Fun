package asd.OOPs.EStatic;


public class Human {
    int age;
    String name;
    float salary;
    boolean married;
    static int population;//


    public Human(int age,String name,float salary,boolean married){  
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.married=married;
       Human.population+=1;
    }

    public static void main(String[] args) {
        Human abc= new Human(12,"ABC",3400f,false);//we create  an object using a constructor from other file usimg PAckages
        Human gef= new Human(52,"gef",3405670f,true);

    System.out.println(abc.population);//this would print 1
    System.out.println(gef.population);//this would also print 1
    //but the o/p should be 2
    //property that are not related to an object, but are related to all the object of that class is called static i.e common to all
    //as here name is personal to both the objects, but popultaion must be common
    //so in line 9, we declare static int population and change this.population to human.population
    // static doesnt relate to object but 'this' represents the object, in order to access statcic variablels use clas names;
    //it will also work with this keyword still
    //System.out.println(gef.population); this is unethical way 
    //use: System.out.println(Human(Class name here).population);
    
    // now lets try to call the void funct
    //greeting();= this will give error. Because its non static in nature.
    //you cannot acces non static stuff without referencing their instance(object) in a static context;
    Human obj= new Human(25,"XYZ",5000f,false);
    obj.greeting();

}
     void greeting(){
        System.out.println("HELLO");
    }
}
