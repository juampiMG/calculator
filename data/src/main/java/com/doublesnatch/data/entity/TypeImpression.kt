package com.doublesnatch.data.entity

import androidx.room.*

@Entity
class TypeImpression constructor(
        @PrimaryKey(autoGenerate = true) var id: Int = 0,
        @ColumnInfo(name = "type") var type: String
)