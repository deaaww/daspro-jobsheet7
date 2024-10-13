import java.util.Scanner;

public class PembayaranParkir08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jenis, durasi = 0, total = 0;

        System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");
        jenis = sc.nextInt();

        while (jenis != 0) {
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan lama durasi parkir (jam): ");
                durasi = sc.nextInt();
            } 
            
            if (durasi > 5) {
                total += 12500;
                System.out.println("Total pembayaran parkir yang harus Anda bayarkan adalah Rp " + total);
                break;
            } else if (jenis == 1) {
                total += durasi * 3000;
                System.out.println("Total pembayaran parkir yang harus Anda bayarkan adalah Rp " + total);
                break;
            } else if (jenis == 2) {
                total += durasi * 2000;
                System.out.println("Total pembayaran parkir yang harus Anda bayarkan adalah Rp " + total);
                break;
            } else {
                System.out.println("Input tidak valid, harap masukkan kembali.");
                break;
            }
        }  

        sc.close();
    }
}