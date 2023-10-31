
import java.util.Scanner;

/**
 * Kelas VolumeBalok digunakan untuk menghitung volume balok berdasarkan panjang, lebar, dan tinggi yang diberikan.
 */
public class VolumeBalok {
    /**
     * Metode ini menghitung volume dari balok berdasarkan panjang, lebar, dan tinggi yang diberikan.
     *
     * @param panjang panjang balok
     * @param lebar   lebar balok
     * @param tinggi  tinggi balok
     * @return volume dari balok yang dihitung berdasarkan rumus panjang x lebar x tinggi
     */
    public double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    /**
     * Metode main untuk menjalankan kelas VolumeBalok dan menghitung volumenya berdasarkan input pengguna.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();

        VolumeBalok calculator = new VolumeBalok();
        double volume = calculator.hitungVolume(panjang, lebar, tinggi);

        System.out.println("Volume dari balok adalah: " + volume);

        scanner.close();
    }
}
