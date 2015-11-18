public class PracticeTest {
    public static void main(String[] args){
        int year;
        year = Integer.arseInt(args[0]);
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 4\
00 == 0));
        System.out.println("Is a Leap Year: " + isLeapYear);
    }
}
