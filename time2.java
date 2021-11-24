
import java.util.Scanner;

public class time2 {
    public static void main(String[] args) {
        int h;
        int m;
        int s;
        Scanner scan = new Scanner(System.in);
    
        time noon = new time(12, 0, 0);
        time check_in = new time();

        System.out.println("Enter Your Check in time as hours minutes and seconds");

        h = scan.nextInt();
        m = scan.nextInt();
        s = scan.nextInt();

        check_in.setHour(h);
        check_in.setMinute(m);
        check_in.setSeconds(s);

        if (noon.isGreater(check_in))
            System.out.println("Good Morning");
        else
            if (noon.isEqual(check_in))
                System.out.println("Lunch Time");
        else
            System.out.println("Good Afternoon");
    }
}
