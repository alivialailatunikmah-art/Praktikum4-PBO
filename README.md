Nama : Alivia Lailatunikmah
NIM  : L0325044
1.	Kelas AsetIT (Representasi Data)
Kelas ini berfungsi sebagai blueprint (cetakan) untuk objek yang merepresentasikan aset IT.
A.	Atribut/Variabel Anggota:
o	idAset: Menyimpan ID unik dari aset.
o	namaPerangkat: Menyimpan nama perangkat (misal: Laptop, Router).
o	lokasi: Menyimpan lokasi aset diletakkan.
o	statusKondisi: Menyimpan status/kondisi aset (misal: Baik, Rusak).
B.	Constructor (public AsetIT(...)):
Method khusus yang dipanggil saat pembuatan objek baru. Digunakan untuk menginisialisasi atau mengisi nilai awal dari keempat atribut di atas menggunakan kata kunci this.
C.	Method tampilkanInfoAset():
Berfungsi mencetak detail informasi aset ke layar dengan format dipisahkan oleh tanda pembatas |
2.	 Kelas ManajemenAset (Pengelola Data)
Kelas ini bertugas untuk mengelola sekumpulan objek AsetIT menggunakan struktur data List / ArrayList.

A.	Deklarasi List:
List<AsetIT> daftarAset = new ArrayList<>();
Membuat penampung dinamis bernama daftarAset yang khusus menyimpan objek-objek berjenis AsetIT.
B.	Method tambahAset(AsetIT asetbaru):
C.	Menambahkan objek aset baru ke dalam daftar (daftarAset.add(asetbaru)).
D.	Method tampilkanSemuaAset():
Menggunakan perulangan For-Each (for (AsetIT aset : daftarAset)) untuk melintasi setiap objek aset di dalam daftar dan memanggil method tampilkanInfoAset() milik kelas AsetIT.
E.	Method hapusAset(String idAset):
Method ini digunakan untuk menghapus aset berdasarkan idAset yang dicari:
•	Menggunakan Iterator: Iterator<AsetIT> it = daftarAset.iterator(); digunakan untuk menelusuri isi ArrayList secara aman saat proses penghapusan data.
•	Pengecekan ID: asetSekarang.idAset.equalsIgnoreCase(idAset) membandingkan ID aset tanpa membedakan huruf besar/kecil.
•	Penghapusan Data: Jika ID cocok, it.remove() dipanggil untuk menghapus aset dari daftar, variabel ditemukan diubah menjadi true, lalu loop dihentikan dengan break.
•	Pesan Peringatan: Jika setelah perulangan selesai variabel ditemukan masih false, program mencetak pesan bahwa aset tidak ditemukan.

Konsep Penting yang Diterapkan:
1.	Encapsulation & Abstraction: Mengelompokkan data aset dan perilaku (method) yang relevan ke dalam kelas tersendiri.
2.	Collection Framework (ArrayList & Iterator): Memungkinkan penambahan dan penghapusan data secara dinamis tanpa batas ukuran kaku seperti pada array biasa.

3.	Fungsi Utama Kelas MainAset
	Kelas MainAset merupakan kelas utama (driver class) yang berisi method main dan berfungsi untuk menguji serta menjalankan seluruh alur program pengelolaan aset IT. Dalam kelas ini, proses diawali dengan membuat objek pengelola bernama manajemen dari kelas ManajemenAset. Selanjutnya, empat objek AsetIT baru dibuat secara langsung dengan mengisi parameter ID, nama perangkat, lokasi, dan status kondisi, kemudian ditambahkan ke dalam daftar koleksi (ArrayList) melalui pemanggilan method tambahAset().

Setelah seluruh data tersimpan, program mencetak judul header "=== DATA ASET AWAL ===" dan memanggil method tampilkanSemuaAset() untuk menampilkan daftar keempat aset yang telah dimasukkan. Selanjutnya, program menjalankan skenario penghapusan dengan mencetak header "=== MENGHAPUS ASET AST03 ===" dan mengeksekusi method hapusAset("AST03"), yang akan mencari serta menghapus perangkat Switch TP-Link dari daftar. Terakhir, program mencetak header "=== DATA ASET SETELAH PENGHAPUSAN ===" dan memanggil kembali tampilkanSemuaAset() untuk memperlihatkan sisa aset yang masih tersimpan, yaitu AST01, AST02, dan AST04.





