package methods;

public class PassByValue {
    public static void main(String[] args) {

////        taking int c and
//        int c = 34;
//        int d = 12;
//
//        swap(c, d);
//        System.out.println(c+" " + d);
//        //the value would remain same becoz the value of copies of a and b got changed
//

//        Dog c = new Dog();
//        c.legs = 4;
//        Dog d = new Dog();
//        d.legs = 3;
//
//
//        swap(c, d);
        Dog a = new Dog();
        a.legs = 4;
        //now if we print a.legs without using changeDog method and inside it passing the parameter a //dog\
        //it will print 4 legs

        changeDog(a);
        //but if we use this function and pass a it would change legs to 6

        System.out.println(a.legs);
    }

    static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
    }

     static void swap(Dog a, Dog b) {
        Dog temp = a;
        a = b;
        b = temp;
    }

    static void changeDog(Dog dog){
        dog.legs = 6;
    }

    static class Dog {
        int legs;
    }
}
