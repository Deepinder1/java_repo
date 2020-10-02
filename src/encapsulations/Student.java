package encapsulations;

public class Student {

   private int age;
   private String name;
//this is a getter
    //getter will get age for us
    public int getAge() {
        return age;
    }

    // this is a setter
// setter will set age for us

    public void setAge(int age) {
        if (age > 20){
            System.out.println("you are old");
        }
        else {
            this.age = age;
            //this.age == private int age while age == parameter age

        }
    }

    // and we modify and add restrictions through the help of getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //these are genereated through generate

}
