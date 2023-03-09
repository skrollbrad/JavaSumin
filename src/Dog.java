public class Dog {

    String name;
    String type;
    int weitght;

    int speed;


    String getInfo() {
        return name + " " + type + " " + weitght;
    }

    void getSpeed() {

        while (speed > 0) {
            speed--;
            System.out.println("Run");

        }


    }

}
