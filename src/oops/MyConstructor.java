package oops;

public class MyConstructor {
    //creating my constructor
    MyConstructor() {
        System.out.println("object is now created");
    }

    static class Vehicle {
        int wheels;
        int headLights;

        //now I am making constructor

        Vehicle(int wheels) {//this is paramettrised constructor
            this.wheels = wheels;
            //this.age == int wheels, while wheels == parameter wheels
            //to know press cmd and click wheels

            headLights =2;//headlights doesnot change according to object
            // so no need to pass in parameterised constructor
        }

    }

    public static void main(String[] args) {
//        MyConstructor obj = new MyConstructor();
        //creating an object with ref obj

        Vehicle car = new Vehicle(4);
        Vehicle scooty = new Vehicle(2);

        System.out.println(car.wheels + " wheels");
        System.out.println(scooty.wheels + " wheels");
    }
}
