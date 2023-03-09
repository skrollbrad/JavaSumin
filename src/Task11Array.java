public class Task11Array {
    public static void main(String[] args) {
//        String[] namesOfMonths = new String[12];
//        namesOfMonths[0] = "January";
//        namesOfMonths[1] = "Februar";
//        namesOfMonths[2] = "March";
//        namesOfMonths[3] = "April";
//        namesOfMonths[4] = "May";
//        namesOfMonths[5] = "June";
//        namesOfMonths[6] = "July";
//        namesOfMonths[7] = "August";
//        namesOfMonths[8] = "September";
//        namesOfMonths[9] = "October";
//        namesOfMonths[10] = "Nowember";
//        namesOfMonths[11] = "December";
//        for (int i = 0; i<namesOfMonths.length;i++) {
//            if (i<namesOfMonths.length-1) {
//                System.out.print(namesOfMonths[i] + "," + " ");
//            }
//            else {
//                System.out.print(namesOfMonths[i] + ".");
//            }
//        }
        int [] numbers = {3,5,10,20,50,33};
        for (int i = numbers.length - 1;i >= 0;i--) {
            System.out.println(numbers[i]);
        }
    }
}
