# Java-Internationalization

# DATABASE

# Util:
Util adalah kelas atau paket yang menyediakan fungsi-fungsi utilitas umum yang dapat digunakan di berbagai bagian aplikasi.
Util biasanya dieksekusi pertama kali, karena komponen-komponen lain mungkin akan membutuhkan fungsi-fungsi yang disediakan oleh util.

# Entity:
Entity adalah kelas-kelas yang merepresentasikan objek data dalam aplikasi.
Entity akan digunakan oleh komponen lain, seperti repository dan service, sehingga perlu disiapkan terlebih dahulu.

# Repository:
Repository adalah komponen yang bertanggung jawab untuk mengakses dan memanipulasi data, biasanya dari/ke database.
Repository akan menggunakan entity untuk mewakili data yang diambil atau disimpan di database.
Repository juga akan memanfaatkan util untuk melakukan operasi-operasi umum terkait dengan data.

# Service:
Service adalah komponen yang berisi logika bisnis aplikasi.
Service akan memanfaatkan repository untuk mengakses data yang dibutuhkan, serta util untuk melakukan operasi-operasi umum.

# View:
View adalah komponen yang bertanggung jawab untuk menampilkan data dan menerima input dari pengguna.
View akan menggunakan data yang disediakan oleh service, serta memanfaatkan util untuk memformat atau memproses data sebelum ditampilkan.

# Test:
Test adalah komponen yang berisi unit test dan integrasi test untuk memverifikasi fungsionalitas aplikasi.
Test akan menggunakan semua komponen lain (entity, repository, service, util) untuk menjalankan skenario pengujian.


mvn archetype:generate

maven-archetype-quickstart

**********************************

    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.11.0-M2</version>
        <scope>test</scope>
    </dependency>

++++++++++++++++++++++++++++++++++

