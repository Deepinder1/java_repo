package object_oriented;

class Cat{
    boolean hasFur;
    String color, breed;
    int legs, eyes, catNum;

    public void walk(){
        System.out.println("Cat"+catNum +" is walking");
    }

    public void eat(){
        System.out.println("Cat is eating");
    }


}

class Dog{

}

public class MainClass {
    public static void main(String[] args) {
        //
       Cat cat1 = new Cat();

       cat1.walk();

    }
}
