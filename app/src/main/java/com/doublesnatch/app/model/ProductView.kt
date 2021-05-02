package com.doublesnatch.app.model


class ProductView constructor(
        var id: Int = 0,
        var name: String,
        var reference: String,
        var gender: String? = null,
        var type: String? = null,
        var detail: String? = null,
        var url: String? = null,
        var priceTill10: Double,
        var priceTill25: Double,
        var priceTill50: Double,
        var priceTill75: Double,
        var priceTill100: Double,
        var priceTill150: Double,
        var priceTill200: Double,
        var priceTill250: Double,
        var priceTill500: Double,
        var moreThan500: Double
)