package id.ivan;

class Kurang extends Header {

    int a, b;

    public Kurang(int a, int b) {
        super.cetak();
        this.a = a;
        this.b = b;
    }

    public int getKurang() {
        return a - b;
    }
}
