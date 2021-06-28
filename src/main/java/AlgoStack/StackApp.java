package AlgoStack;
public class StackApp {
    public static void main(String[] args) {
        var tumpukan = new Stack(10);
        
        tumpukan.push(16); //NIM 20090086
        tumpukan.tampil();
        tumpukan.push(30);
        tumpukan.tampil();
        System.out.println("Nilai teratas  = "+tumpukan.peek());
        System.out.println("Nama  lengkap saya adalah = Moh.Faizal Ilham Falakh ");
        System.out.println("Nilai yang dihapus  = "+tumpukan.pop());
        tumpukan.tampil();
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.tampil();
        tumpukan.push(50);
        tumpukan.tampil();
    }
}
