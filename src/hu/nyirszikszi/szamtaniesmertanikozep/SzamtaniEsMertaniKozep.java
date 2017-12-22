package hu.nyirszikszi.szamtaniesmertanikozep;

public class SzamtaniEsMertaniKozep {
    private int a;
    private int b;

    public SzamtaniEsMertaniKozep(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    private double getSzamtaniKozep() {
        return (this.a + this.b) / 2;
    }

    private double getMertaniKozep() {
        return Math.sqrt(this.a * this.b);
    }

    public String getSzamtaniEsMertaniKozep() {
        return "Szamtani kozep:\t" + getSzamtaniKozep() + "\nMertani kozep:\t" + getMertaniKozep();
    }
}