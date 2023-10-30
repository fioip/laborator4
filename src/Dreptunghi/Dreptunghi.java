package Dreptunghi;

interface Forma {
    int calcArie();
    int calcPerimetru();
}

public class Dreptunghi implements Forma {
    int inaltime, latime;

    public Dreptunghi(int latime, int inaltime) {
        this.inaltime = inaltime;
        this.latime = latime;
    }

    public static void main(String[] args) {
       Dreptunghi dreptunghi = new Dreptunghi(2, 4);
        System.out.println("Perimetrul este: " + dreptunghi.calcPerimetru());
        System.out.println("Aria este: " + dreptunghi.calcArie());
    }

    @Override
    public int calcArie() {
        return this.inaltime * this.latime;
    }

    @Override
    public int calcPerimetru() {
        return 2 * this.inaltime + 2 * this.latime;
    }
}
