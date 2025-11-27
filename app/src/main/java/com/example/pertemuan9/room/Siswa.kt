package com.example.myroomsatu.room // Sesuaikan dengan nama package project kamu jika berbeda

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tblSiswa")
data class Siswa(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nama: String,
    val alamat: String,
    val telpon: String
)