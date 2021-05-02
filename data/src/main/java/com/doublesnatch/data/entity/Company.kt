package com.doublesnatch.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Company constructor(
        @PrimaryKey(autoGenerate = true) var id: Int = 0,
        @ColumnInfo(name = "name") var name: String
)