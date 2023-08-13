public class Mahasiswa {
    private final String nama;
    private final String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Ary Prakosa", "2113010294");

        System.out.println("Informasi Mahasiswa:");
        mahasiswa.tampilkanInfo();
    }
}