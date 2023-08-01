# Program Pengecekan Validitas Nama Pengguna
Program ini memungkinkan pengguna untuk memasukkan nama pengguna (username) dan melakukan validasi untuk memastikan bahwa nama pengguna 
hanya mengandung huruf dan angka, diawali dengan huruf, dan memiliki panjang antara 5 hingga 12 karakter.

# Cara Penggunaan
1. Jalankan program dengan menjalankan fungsi main() di kelas Main.
2. Program akan menampilkan pesan selamat datang dan meminta pengguna untuk memasukkan nama pengguna.
3. Masukkan nama pengguna sesuai dengan kriteria yang telah ditentukan.
4. Program akan melakukan validasi sesuai dengan kriteria berikut:

   - Nama pengguna hanya boleh menggunakan huruf (baik huruf besar maupun kecil) dan angka.
   - Nama pengguna harus diawali dengan huruf dan tidak boleh diawali dengan angka.
   - Nama pengguna harus terdiri dari 5 hingga 12 karakter.
     
5. Jika nama pengguna memenuhi semua kriteria validasi, program akan menampilkan pesan "Selamat, nama pengguna sudah valid!" dan program akan selesai.
6. Jika nama pengguna tidak memenuhi salah satu atau semua kriteria validasi, program akan menampilkan pesan kesalahan terkait kriteria yang tidak terpenuhi dan meminta pengguna untuk memasukkan nama pengguna baru.
7. Langkah 3 hingga 6 akan berulang sampai nama pengguna yang valid dimasukkan.

# Contoh Output

<pre>

```
Selamat datang di Program pengecekan validitas Nama Pengguna!
Masukkan nama pengguna (Username): abc123
Maaf, nama pengguna harus dimulai dengan huruf.

Masukkan nama pengguna (Username): 123abc
Selamat, nama pengguna sudah valid!
```
</pre>

# Penjelasan Kode

1. Fungsi validasiUsername(Scanner input): Fungsi ini mengambil input dari pengguna menggunakan objek Scanner yang diberikan sebagai parameter. Fungsi ini akan melakukan validasi untuk memastikan bahwa nama pengguna sesuai dengan kriteria yang telah ditentukan. Jika validasi berhasil, fungsi akan mengembalikan nama pengguna yang valid.
2. Fungsi main(String[] args): Fungsi ini merupakan titik masuk utama program. Fungsi ini akan membuat objek Scanner, memanggil fungsi validasiUsername(), dan menutup objek Scanner setelah selesai membaca input dari pengguna.
