package com.doublesnatch.data.entity

import androidx.room.*

@Entity(foreignKeys =
[
    ForeignKey(
            entity = Company::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("idCompany"),
            onDelete = ForeignKey.CASCADE
    ),
    ForeignKey(
            entity = TypeImpression::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("idTypeImpression"),
            onDelete = ForeignKey.CASCADE
    )
], indices = [Index(value = ["idCompany", "idTypeImpression"])]
)
class Impression constructor(
        @PrimaryKey(autoGenerate = true) var id: Int = 0,
        @ColumnInfo(name = "priceTill10") var priceTill10: Double,
        @ColumnInfo(name = "priceTill25") var priceTill25: Double,
        @ColumnInfo(name = "priceTill50") var priceTill50: Double,
        @ColumnInfo(name = "priceTill75") var priceTill75: Double,
        @ColumnInfo(name = "priceTill100") var priceTill100: Double,
        @ColumnInfo(name = "priceTill150") var priceTill150: Double,
        @ColumnInfo(name = "priceTill200") var priceTill200: Double,
        @ColumnInfo(name = "priceTill250") var priceTill250: Double,
        @ColumnInfo(name = "priceTill500") var priceTill500: Double,
        @ColumnInfo(name = "moreThan500") var moreThan500: Double,
        @ColumnInfo(name = "idTypeImpression") var idTypeImpression: Int,
        @ColumnInfo(name = "idCompany") var idCompany: Int
)