public class Task7 {

    public static void main(String[] args) {
        int temp = 30;
        boolean hot = temp > 25;
        boolean cold = temp < 22;
        int time = 23;
        boolean isNight = time > 22 || time < 6;
        if (hot && !isNight) {
            System.out.println("Condition ON");

        }
        else if (cold) {
            System.out.println("Condition Off");
        }
        else {
            System.out.println("Condition stee");
        }
    }
}
