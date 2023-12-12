public class Pelanggan implements iMiniMarket{
    public String nama;
    public String noHP;
    public String alamat;

    public Pelanggan (String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    @Override
    public void cetakFaktur() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cetakFaktur'");
    }

    @Override
    public Integer totalBayar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'totalBayar'");
    }


    
}
