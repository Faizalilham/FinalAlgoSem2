package AlgoQueue;
public class QueueApp {
    public static void main(String[] args) {
        var antrian = new Queue(10);
        
        antrian.masuk(59); //NIM 20090086
        antrian.lihat();
        antrian.masuk(60);
        antrian.lihat();
        System.out.println("Nilai yang paling depan = "+ antrian.peekDepan());
        System.out.println("Nama  lengkap saya adalah = Moh.Faizal Ilham Falakh ");
        System.out.println(" ");
        antrian.masuk(70);
        antrian.lihat();
        System.out.println("Nilai yang diambil dari antrian = "+ antrian.keluar());
        antrian.lihat();
        System.out.println("Nilai yang Pling depan = "+ antrian.peekDepan());
   
    }
}
