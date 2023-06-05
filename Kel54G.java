import java.util.Scanner;

public class Kel54G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Masukkan jumlah pembelian: ");
            double totalPembelian = scanner.nextDouble();

            System.out.print("Masukkan persentase PPN: ");
            double persentasePPN = scanner.nextDouble();

            double pajak = totalPembelian * (persentasePPN / 100);
            double totalBayar = totalPembelian + pajak;

            System.out.println("Pajak yang harus dibayar: " + pajak);
            System.out.println("Total pembayaran: " + totalBayar);

            System.out.print("Apakah Anda ingin menghitung PPN lagi? (Y/T): ");
            ulang = scanner.next().charAt(0);
        } while (ulang == 'Y' || ulang == 'y');

        scanner.close();
    }
}