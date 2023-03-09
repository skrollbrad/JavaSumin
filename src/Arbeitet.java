public class Arbeitet {
    String name;
    String dolj;

    double zp;

    Arbeitet(String name,String dolj,double zp) {
        this.name = name;
        this.dolj = dolj;
        this.zp = zp;
    }
    void showInfo () {
        System.out.println(name + " " + dolj + " " + zp);
    }



}
