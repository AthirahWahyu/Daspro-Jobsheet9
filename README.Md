# JOBSHEET 9

# PERCOBAAN 

## - Percobaan 1 : Mengisi Elemen Array 

## - Percobaan 1 : Verifikasi Hasil Percobaan

![Verifikasi1](./Verifikasi1.png)

_Pertanyaan:_

1.  Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000.
Apa yang terjadi? Mengapa bisa demikian?
2.  Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus
pada saat deklarasi array.
3.  Ubah statement pada langkah No 4 menjadi seperti berikut
    ```java
        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        } 
    ```
    Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
4.  Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran
    dari program? Mengapa demikian?

_Jawaban:_

1.  Yang akan terjadi 

![P1n1](./P1n1.png)

    - Alasannya : Elemen array bertipe int hanya bisa diisi bilangan bulat (tanpa koma). Jika ingin menyimpan angka pecahan seperti 5.0 atau 7.5 harus mengubah tipe array menjadi double
