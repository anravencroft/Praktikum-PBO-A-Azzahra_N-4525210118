public class Trapesium extends BangunDatar {

    private final double tinggi;
    private final double sisiAtas;
    private final double sisiSamping;
    private final double sisiBawah;
    

    public Trapesium(double tinggi, double sisiAtas, double sisiSamping, double sisiBawah) {
        super("Trapesium");
        // Tambahkan validasi penolak untuk seluruh parameter jika diisi <= 0
        if (sisiAtas <= 0 || sisiSamping <= 0 || sisiBawah <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi harus lebih besar dari 0");
        }
        this.tinggi = tinggi;
        this.sisiAtas = sisiAtas;
        this.sisiSamping = sisiSamping;
        this.sisiBawah = sisiBawah;
        
        
    }

    @Override
    public double luas() {
        return 0.5 * (this.sisiAtas + this.sisiBawah) * this.tinggi;
    }

    @Override
    public double keliling() {
        return this.sisiAtas + this.sisiBawah + this.sisiSamping;
    }

}
