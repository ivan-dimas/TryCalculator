package id.ivan;

class Tambah extends Header {

    int a, b;

    public Tambah(int a, int b) {
        super.cetak();
        this.a = a;
        this.b = b;
    }

    public int getTambah() {
        return a + b;
    }
}
