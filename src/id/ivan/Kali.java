package id.ivan;

class Kali extends Header {

    int a, b;

    public Kali(int a, int b) {
        super.cetak();
        this.a = a;
        this.b = b;
    }

    public int getKali() {
        return a * b;
    }
}
