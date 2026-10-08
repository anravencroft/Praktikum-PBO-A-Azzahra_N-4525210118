public class Sepeda extends Kendaraan implements Movable {

    private double isiTangki = 0;

    public Sepeda(String merek, int tahun) {
        super(merek, tahun);
    }

    @Override
    public int jumlahRoda() {
        return 2;
    }

    @Override
    public void bergerak() {
        System.out.println(super.merek + " melaju di jalanan kota Bogor");
    }

    @Override
    public double kecepatanMaksimum() {
        return 45;
    }

    public double getIsiTangki() {
        return isiTangki;
    }
}
