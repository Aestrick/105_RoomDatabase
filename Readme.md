# 105_RoomDatabase

Aplikasi Manajemen Data Siswa berbasis Android yang dibangun menggunakan **Kotlin**, **Jetpack Compose**, dan **Room Database**.

Project ini dibuat untuk memenuhi tugas **Activity 7 - Room Database** pada mata kuliah Pemrograman Aplikasi Mobile. Aplikasi ini menerapkan arsitektur **MVVM (Model-View-ViewModel)** dan operasi **CRUD (Create, Read, Update, Delete)** pada database lokal.

## 📸 Dokumentasi Aplikasi

Berikut adalah dokumentasi dari semua operasi yang dapat dilakukan dalam aplikasi:

### 1. Halaman Utama (List Data)
Menampilkan daftar semua siswa yang tersimpan dalam database lokal (Room).
<br>
<img width="486" height="934" alt="Screenshot 2025-12-04 163213" src="https://github.com/user-attachments/assets/ca915ee9-2972-4d1b-9419-44c99d5b005e" />

### 2. Tambah Data (Create)
Formulir untuk menambahkan data siswa baru. Validasi input aktif untuk mencegah data kosong.
<br>
<img width="487" height="969" alt="Screenshot 2025-12-04 163510" src="https://github.com/user-attachments/assets/921a620d-8a63-4377-95ac-720586512855" />

### 3. Detail Data (Read)
Menampilkan rincian informasi siswa yang dipilih dari daftar.
<br>
<img width="470" height="811" alt="screenshot_form png" src="https://github.com/user-attachments/assets/101c0c25-1d06-47d2-bb06-cc8d6c26ad93" />

### 4. Hapus Data (Delete)
Fitur untuk menghapus data siswa dengan konfirmasi dialog untuk mencegah kesalahan hapus.
<br>
<img width="480" height="963" alt="Screenshot 2025-12-04 163620" src="https://github.com/user-attachments/assets/23dba0a0-8143-405d-9c9d-2968662f8295" />

## 🛠️ Fitur & Teknologi

* **Language:** Kotlin
* **UI Framework:** Jetpack Compose (Material3)
* **Database:** Room Database (SQLite Abstraction Layer)
* **Architecture:** MVVM (Model-View-ViewModel)
* **Navigation:** Navigation Compose
* **Dependency Injection:** Manual DI (AppContainer)
* **Asynchronous:** Kotlin Coroutines & Flow

## 👤 Identitas Pengembang

* **Nama:** Nashrul Fikri
* **NIM:** 20230140105
* **Kelas:** C

---
*Repository ini dibuat sebagai submission untuk Activity 7.*
