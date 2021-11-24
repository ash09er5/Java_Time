import java.util.Scanner;

public class time3 {
    public static void main(String[] args) {
        time t1 = new time();
        time noon= new time(12,0,0);
        
        Scanner scan = new Scanner(System.in);
        int h;
        int m;
        int s;


        System.out.println("Enter check in time as Hours:Mins:Secs");

        h=scan.nextInt();
        m=scan.nextInt();
        s=scan.nextInt();

        
        t1.setHour(h);
        t1.setMinute(m);
        t1.setSeconds(s);
        
        scan.close();
        
        if (noon.isGreater(t1))
            System.out.println("Good Morning");
        else
            if (noon.isEqual(t1))
                System.out.println("Good Afternoon");
        else
            System.out.println("Good Evening Its dinner time");

    }
}
