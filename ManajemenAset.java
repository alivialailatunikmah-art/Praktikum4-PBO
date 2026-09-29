package TugasPraktikum4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManajemenAset {
    List<AsetIT> daftarAset = new ArrayList<>();

    public void tambahAset(AsetIT asetbaru) {
        daftarAset.add(asetbaru);
    }

    public void tampilkanSemuaAset() {
        System.out.println("--- Daftar Seluruh Aset IT ---");
        for (AsetIT aset : daftarAset) {
            aset.tampilkanInfoAset();
        }
    }

    public void hapusAset(String idAset) {
        Iterator<AsetIT> it = daftarAset.iterator();
        boolean ditemukan = false;

        while (it.hasNext()) {
            AsetIT asetSekarang = it.next();
            if (asetSekarang.idAset.equalsIgnoreCase(idAset)) {
                it.remove();
                ditemukan = true;
                System.out.println("Aset dengan ID " + idAset + " berhasil dihapus.");
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Peringatan: Aset dengan ID " + idAset + " tidak ditemukan!");
        }
    }
}