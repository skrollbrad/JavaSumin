public class Task8 {
    public static void main(String[] args) {
        boolean pogoda = true;
        boolean night = false;


        if (!night && pogoda) {
            System.out.println("Gehen");
        }
        else if (!night && !pogoda) {
            System.out.println("lesen buch");
        }
        else if (night) {
            System.out.println("Sleep");
        }
    }
}
