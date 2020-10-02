package findingmaths;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2400;
        if (year%400 == 0)
            System.out.println("leap");
        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println("not leap");
        else
            System.out.println(" notleap");
    }
}
