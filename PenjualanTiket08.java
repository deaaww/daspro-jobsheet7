import java.util.Scanner;

public class PenjualanTiket08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket;
        double totalHarga, diskon;

        while (true) {
            System.out.println("Masukkan total tiket yang terjual (ketik 'keluar' untuk meninggalkan perhitungan): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("keluar")) {
                break;
            }

            try {
                totalTiket = Integer.parseInt(input);

                if (totalTiket < 0) {
                    System.out.println("Input tidak valid, harap masukkan kembali.");
                    continue;
                }

                if (totalTiket > 10) {
                    diskon = 0.15;
                    System.out.println("Diskon yang didapatkan adalah 10%");
                } else if (totalTiket > 4) {
                    diskon = 0.10;
                    System.out.println("Diskon yang didapatkan adalah 15%");
                } else {
                    diskon = 0;
                    System.out.println("Tidak ada diskon yang didapatkan.");
                }
            
                totalHarga = hargaTiket * totalTiket * (1 - diskon);

                System.out.println("Maka total harga tiket yang terjual selama satu hari adalah Rp " + totalHarga);

                System.out.println("----------");

            } catch (Exception e) {
                System.out.println("Input tidak valid, harap masukkan angka");
            }
        }

        sc.close();
    }
}