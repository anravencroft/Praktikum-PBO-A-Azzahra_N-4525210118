public class Segitiga extends BangunDatar {

    private final double a, b, c;

    public Segitiga(double a, double b, double c) {
        super("Segitiga");
        // Tolak ukuran 0 atau negatif
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Sisi harus lebih besar dari 0");
        }

        // Tolak jika ketiga sisi tidak memenuhi syarat segitiga
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Ketiga sisi tidak membentuk segitiga.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double luas() {
        // Menggunakan rumus Heron
        double s = keliling() / 2; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    }

    @Override
    public double keliling() {
        return a + b + c;
    }

}
