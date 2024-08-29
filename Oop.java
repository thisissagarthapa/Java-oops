// oop-object oriented programming language is a concept which is used to map in real world scenarios
/* class Animal{
    String color;
    String name;
    Animal(String name,String color){
        this.color=color;
        this.name=name;

    }
    public void Bird(){
     System.out.println(String.format("%s is one of the beautiful birds with beautiful %s color ",name,color));
    }
}

public class Oop{
public static void main(String[] args) {
    Animal bird=new Animal("parrot","red");
    bird.Bird();
    Animal bird1=new Animal("pigeon","white");
    bird1.Bird();
}
} */


// Method overloading --if same name of methods  are created in one class and their output is different when the instance of class is called through the variance of parameter it is called method overloading
/* class Animal{
    public void Bird(String color, String name,int weight){
     System.out.println(String.format("%s is one of the beautiful birds with  %s color and weights %dkg ",name,color,weight));
    }
    public void Bird(String color, String name){
     System.out.println(String.format("%s is one of the beautiful birds with  %s color",name,color));
    }
    public void Bird(String name){
     System.out.println(String.format("%s is one of the beautiful birds of nepal ",name));
    }
}

public class Oop{
public static void main(String[] args) {
    Animal bird=new Animal();
    bird.Bird("Brown","Ostrich",50);

    Animal bird1=new Animal();
    bird1.Bird("red","parrot");

    Animal bird2=new Animal();
    bird2.Bird("Danfe");
}
} */

// Inheritance--It is a concept in object oriented programming that allows us to inherit all the properties of parent class or sub parent class to child or subchild classes.


// single-level inheritance--single child class can derived form single parent class is called single level inheritance
/* class Animal{
    public void bird(){
    System.out.println("bird chirps");
    }
}

class Animal2 extends Animal{
    public void dog(){
        System.out.println("dog barks");
    }
    
}

public class Oop{
    public static void main(String[] args) {
        Animal2 dog=new Animal2();
        dog.dog();
        dog.bird();
    }
} */

// multi-level inheritance--In this inheritance the derived class which was derived form parent class further gets derived form other sub classes and so on 
/* class Animal{
    public void bird(){
    System.out.println("bird chirps");
    }
}

class Animal2 extends Animal{
    public void dog(){
        System.out.println("dog barks");
    }
    
}
class Animal3 extends Animal2{
    public void cow(){
        System.out.println("cow moos");
    }
    
}

public class Oop{
    public static void main(String[] args) {
        Animal3 cow=new  Animal3();
        cow.bird();
        cow.dog();
        cow.cow();
    }
} */

// heirarchical inheritance--It is a inheritance where multiple child class can be derived form their parents class
/* class Animal{
    public void bird(){
    System.out.println("bird chirps");
    }
}

class Animal2 extends Animal{
    public void dog(){
        System.out.println("dog barks");
    }
    
}
class Animal3 extends Animal2{
    public void cow(){
        System.out.println("cow moos");
    }
    
}

public class Oop{
    public static void main(String[] args) {
        Animal3 cow=new  Animal3();
        cow.bird();
        cow.dog();
        cow.cow();
    }
} */



// ENCAPSULATION ||ACCESS MODIFIER--encapsulation is a process of wrapping the data(variables) and methods in a single unit.Access modifier  controls the visibility and accessibility of classes,methods and fields.They help in encapsulation by specifying who can access what.


// Four Access modifier--default,public,private,protected
/* class Animal{
    protected void bird(){ //it can only be used within package and sub classes
    System.out.println("bird chirps");
    }
}

class Animal2 extends Animal{
    public void dog(){ //it can be used anywhere
        System.out.println("dog barks");
    }
    
}
class Animal3 extends Animal2{
    private void cow(){  //it can be used within this class only
        System.out.println("cow moos");
    }
    
}

public class Oop{
    public static void main(String[] args) {
        Animal3 cow=new  Animal3();
        cow.bird();
        cow.dog();
    }
} */

//Abstract class-- Abstract classes are used to provide a base for subclasses to build upon, allowing for a common structure and behavior across multiple derived classes.

/* abstract  class  Animal{
    protected void bird(){ //it can only be used within package and sub classes
    System.out.println("bird chirps");
    }
}

class Animal2 extends Animal{
    public void dog(){ //it can be used anywhere
        System.out.println("dog barks");
    }
    
}
class Animal3 extends Animal2{
    private void cow(){  //it can be used within this class only
        System.out.println("cow moos");
    }
    
}

public class Oop{
    public static void main(String[] args) {
        Animal3 cow=new  Animal3();
        cow.bird();
        cow.dog();
        cow.cow();//not accessible  due to private method in animal3 class
    }
}  */


// Interface--In Java, an interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. 
interface Bird {
    void chirp(); // Interface method (does not have a body)
}

interface Dog {
    void bark(); // Interface method (does not have a body)
}

interface Cow {
    void moo(); // Interface method (does not have a body)
}

class Animal3 implements Bird, Dog, Cow {
    @Override
    public void chirp() {
        System.out.println("Bird chirps");
    }

    @Override
    public void bark() {
        System.out.println("Dog barks");
    }

    @Override
    public void moo() {
        System.out.println("Cow moos");
    }
}

public class Oop {
    public static void main(String[] args) {
        Animal3 animal = new Animal3();
        animal.chirp(); // Calls the chirp method from Bird interface
        animal.bark();  // Calls the bark method from Dog interface
        animal.moo();   // Calls the moo method from Cow interface
    }
}



