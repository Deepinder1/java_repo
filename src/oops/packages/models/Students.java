package oops.packages.models;

public class Students {
//this is String
    //this is private
    private String name;

    //this is constructor
    //it called in any class
    public Students(String name) {
        this.name = name;
    }


    //this is method
    public String getName() {
        return name;
    }
//this getPassword is default cannot be accessed in mainclass but in the classes of same package
    //means it can be accessed in teacher class

     String getPassword() {
        return "ljfldjfeor@";
    }
}
