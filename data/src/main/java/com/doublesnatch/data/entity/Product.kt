package com.doublesnatch.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Product constructor(
        @PrimaryKey(autoGenerate = true) var id: Int = 0,
        @ColumnInfo(name = "name") var name: String,
        @ColumnInfo(name = "reference") var reference: String,
        @ColumnInfo(name = "gender") var gender: String,
        @ColumnInfo(name = "type") var type: String,
        @ColumnInfo(name = "detail") var detail: String,
        @ColumnInfo(name = "url") var url: String,
        @ColumnInfo(name = "priceTill10") var priceTill10: Double,
        @ColumnInfo(name = "priceTill25") var priceTill25: Double,
        @ColumnInfo(name = "priceTill50") var priceTill50: Double,
        @ColumnInfo(name = "priceTill75") var priceTill75: Double,
        @ColumnInfo(name = "priceTill100") var priceTill100: Double,
        @ColumnInfo(name = "priceTill150") var priceTill150: Double,
        @ColumnInfo(name = "priceTill200") var priceTill200: Double,
        @ColumnInfo(name = "priceTill250") var priceTill250: Double,
        @ColumnInfo(name = "priceTill500") var priceTill500: Double,
        @ColumnInfo(name = "moreThan500") var moreThan500: Double
)