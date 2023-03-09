import java.io.IOException;
import java.util.Scanner;

public class Task13SwitchCase {
    public static void main(String[] args) throws IOException {
//        Scanner id = new Scanner(System.in);
//        String[] month = {"Januar","Februar","March","April","May","Juni","Juli","August","September","November","December"};
//
//        for (int i = 1; i <month.length ;i++) {
//
//            System.out.println(month[id.nextInt()-1]);
//        }
        String month = "Apr";
        switch (month) {
            case "Januar":
                System.out.println("Zima");
                break;
            case "Feb":
                System.out.println("Zima");
                break;
            case "Mar":
                System.out.println("Vesna");
                break;
            case "Apr":
                System.out.println("Vesna");
                break;



        }
    }
}


