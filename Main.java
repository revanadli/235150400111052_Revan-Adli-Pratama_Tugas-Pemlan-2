import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        ArrayList<mahasiswa> dataMahasiswa = new ArrayList<>();

        while (true) {
            mahasiswa Mahasiswa = new mahasiswa();

            System.out.print("Masukkan nama : ");
            String nama = input.nextLine();

            System.out.print("Masukkan nim : ");
            String nim = input.nextLine();

            System.out.print("Masukkan alamat : ");
            String alamat = input.nextLine();

            Mahasiswa.setNama(nama);
            Mahasiswa.setNIM(nim);
            Mahasiswa.setAlamat(alamat);

            dataMahasiswa.add(Mahasiswa);

            System.out.print("Tambah lagi (ya / tidak) ? ");
            String tambahData = input.nextLine();

            if (tambahData.equalsIgnoreCase("tidak")) {
                System.out.println("============================");
                for (int i = 0; i < dataMahasiswa.size(); i++) {
                    mahasiswa data = dataMahasiswa.get(i);
                    System.out.println(data.getNama() + " | " + data.getNIM() + "|" + data.getAlamat());
                }
                break;
            }
        }
    }
}
