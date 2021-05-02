package com.doublesnatch.data.entity

import androidx.room.*

@Entity(foreignKeys =
[
    ForeignKey(
            entity = Company::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("idCompany"),
            onDelete = ForeignKey.CASCADE
    )
], indices = [Index(value = ["idCompany"])]
)
class SerigraphyImpression constructor(
        @PrimaryKey(autoGenerate = true) var id: Int = 0,
        @ColumnInfo(name = "oneColor") var oneColor: Double,
        @ColumnInfo(name = "twoColors") var twoColors: Double,
        @ColumnInfo(name = "threeColors") var threeColors: Double,
        @ColumnInfo(name = "fourColors") var fourColors: Double,
        @ColumnInfo(name = "fiveColors") var fiveColors: Double,
        @ColumnInfo(name = "idCompany") var idCompany: Int
)