package id.ivan;

class Bagi extends Header {

    int a, b;

    public Bagi(int a, int b) {
        super.cetak();
        this.a = a;
        this.b = b;
    }

    public int getBagi() {
        return a / b;
    }
    
}
