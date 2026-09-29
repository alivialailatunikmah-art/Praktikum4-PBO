package TugasPraktikum4;

public class MainAset {
    public static void main(String[] args) {
        ManajemenAset manajemen = new ManajemenAset();

        manajemen.tambahAset(new AsetIT("AST01", "Server Utama", "Ruang Server", "Baik"));
        manajemen.tambahAset(new AsetIT("AST02", "Router Cisco", "Lantai 2", "Baik"));
        manajemen.tambahAset(new AsetIT("AST03", "Switch TP-Link", "Lantai 1", "Rusak"));
        manajemen.tambahAset(new AsetIT("AST04", "PC Lab 1", "Ruang Lab", "Baik"));

        System.out.println("=== DATA ASET AWAL ===");
        manajemen.tampilkanSemuaAset();

        System.out.println("\n=== MENGHAPUS ASET AST03 ===");
        manajemen.hapusAset("AST03");

        System.out.println("\n=== DATA ASET SETELAH PENGHAPUSAN ===");
        manajemen.tampilkanSemuaAset();
    }
}