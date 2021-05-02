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
class DigitalImpression constructor(
        @PrimaryKey(autoGenerate = true) var id: Int = 0,
        @ColumnInfo(name = "tenXten") var tenXten: Double,
        @ColumnInfo(name = "twentyfiveXtwentyfive") var twentyfiveXtwentyfive: Double,
        @ColumnInfo(name = "thirtyXforty") var thirtyXforty: Double,
        @ColumnInfo(name = "idCompany") var idCompany: Int
)