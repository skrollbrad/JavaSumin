public class Box {
    double lenght;
    double width;
    double height;
    Box(double lenght,double width, double height) {
        this.height = height;
        this.width = width;
        this.lenght = lenght;
    }
    Box (double size) {
        this(size,size,size);
    }

     void setDimens(double lenght,double width, double height) {
        this.height = height;
        this.width = width;
        this.lenght = lenght;

    }
    Box (Box another) {
        this(another.lenght, another.width, another.height);
    }
    Box copy() {
        Box box = new Box(this.lenght,this.width,this.height);
        return box;

    }
    Box incres() {
        Box box = new Box(lenght*2, width*2,height*2);
        return box;
    }
    int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result = 1;
        }
        else if (currentVolume < anotherVolume) {
            result = -1;

        }
        else {
            result = 0;
        }
        return result;
    }

//    void compare(Box another) {
//        double currentVolume = getVolume();
//        double anotherVolume = another.getVolume();
//        if (currentVolume > anotherVolume) {
//            System.out.println("current > Another");
//        }
//        else if (currentVolume < anotherVolume) {
//            System.out.println("Current < another");
//
//        }
//        else {
//            System.out.println("Current == Another");
//        }
//    }





    double getVolume() {
        double volume = lenght * width * height;
        return volume;
    }
    void showVolume () {

        System.out.println(getVolume());

    }
}
