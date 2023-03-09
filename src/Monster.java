public class Monster {
    int countRuk, countGlaz, countNog;



    Monster(int count) {
        this(count, count, count);
    }

    Monster(int countRuk, int countGlaz, int countNog) {
        this.countGlaz = countGlaz;
        this.countNog = countNog;
        this.countRuk = countRuk;
    }
    Monster() {
        this(2);
    }
    void voice() {
        System.out.println("GRRRRRRRRRRRR");

    }

    void voice(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("GRRRRRRRRRRRR");
        }

    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }

    }


}
