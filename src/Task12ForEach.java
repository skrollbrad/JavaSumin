public class Task12ForEach {
    public static void main(String[] args) {
        int[] student = new int[100];
        int numbers = 99;
        for (int i = 0;i < student.length;i++) {
            numbers++;
            student[i] = numbers;
           // System.out.println(student[i]);
        }
        for(int result:student) {
            System.out.println(result);
        }
    }
}
