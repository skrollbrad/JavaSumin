public class MyMath {
    private static final double pi = 3.14;

    public static int sum(int...numbers) {
        int sum = 0;
        for(int number: numbers) {
            sum += number;
        }
        return sum;
    }
    public static double length(double radius) {
        return 2*pi * radius;
    }
    public static double area(double radius) {
        return pi*radius*radius;
    }


    public static int multiple (int a, int b) {
        return a*b;
    }
    public static double multiple(double a,double b) {
        return a*b;
    }
    public static int multiple (int a,int b,int c) {
        return a*b*c;
    }
}
