import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  



public class Penjualan extends Pelanggan {
    public String namaBarang;
    public Integer hargaBarang;
    public Integer jumlahBarang;
    public Integer totalBayar;
    public String kodeBarang;
    public String kasir[] = {"abdi","aldi","aldo"};
    public Integer noKasir;
    public static Integer noFaktur = 0;


    
    
    public Penjualan(String nama, String alamat, String kodeBarang, String namaBarang, Integer hargaBarang, Integer jumlahBarang,int noKasir){
        super(nama,alamat);
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.totalBayar = hargaBarang * jumlahBarang;
        this.noKasir = noKasir;
        cetakFaktur();
    }

    @Override
    public void cetakFaktur(){
        // System.out.println();
        // System.out.println("--------------------------------------------");
        // System.out.println();
        // System.out.println("                 Faktur " );
        // System.out.println("                 ------                     ");
        // System.out.println("                 MMHH0" + ++noFaktur +"                        ");
        // System.out.println();
        // System.out.println("SuperMarket : hehe      Alamat : Jalan Unand");
        // System.out.println("============================================");
        // System.out.println("Atas Nama    : " + nama);
        // //System.out.println("No      : " + noHP);

        // System.out.println("============================================");
        // System.out.println(namaBarang);
        // System.out.println("Rp." + hargaBarang + " * " + jumlahBarang  +" = " + totalBayar);
        // System.out.println("============================================");
        // System.out.println("Total        : Rp." + totalBayar );
        // System.out.println();
        // System.out.println();
        // System.out.println("--------------------------------------------");

        System.out.println("SUPERMARKET OLDERS");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime now = LocalDateTime.now();
        System.out.println("Tanggal        : " + dtf.format(now));
        DateTimeFormatter jam = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Waktu          : " + jam.format(now) + "WIB");
        System.err.println();
        System.out.println("====================");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Alamat         : " + super.alamat);
        System.out.println("++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("--------------------");
        System.out.println("Kode Barang    : " + kodeBarang);
        System.out.println("Nama Barang    : "+ namaBarang);
        System.out.println("Jumlah Beli    : " + jumlahBarang);
        System.out.println("Total Bayar    :"+ totalBayar);
        System.out.println("++++++++++++++++++++");
        System.out.println("Kasir          :  "+ kasir[noKasir]);


    }
}