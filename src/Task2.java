public class Task2 {
    public static void main(String[] args) {
        int x = 5;
        int y = x+5;
        int djon = 100;
        int nick = (djon*5);
        int sum = djon + nick;

        int days = 1001;
        int years = days / 365;
        int month = (days - (years*365)) / 30;
        int day = days - (years*365) - (month*30);
        System.out.println(day);
        System.out.println(month);
        System.out.println(years);



    }


}
