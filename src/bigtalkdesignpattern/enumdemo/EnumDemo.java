package bigtalkdesignpattern.enumdemo;

public class EnumDemo {

    public static void main(String[] args) {
        Day day=Day.MONDAY;
        System.out.println(day.toString());


    }
}

enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}