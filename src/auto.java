import java.util.Scanner;

public class auto {
    private String name;
    private int age;


    // Constructor untuk menginisialisasi atribut
    public auto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method untuk mengambil nilai atribut 'name'
    public String getName() {
        return this.name;
    }

    // Method untuk mengambil nilai atribut 'age'
    public int getAge() {
        return this.age;
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Nama: " + this.name);
        System.out.println("Umur: " + this.age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan umur: ");
        int age = scanner.nextInt();

        // Membuat objek SimpleClass berdasarkan input pengguna
        auto obj = new auto(name, age);

        // Memanggil method displayInfo untuk menampilkan informasi yang diinputkan pengguna
        obj.displayInfo();

        scanner.close();
    }
}

