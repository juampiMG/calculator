package com.doublesnatch.app.model


class ImpressionView constructor(
        var id: Int = 0,
        var priceTill10: Double,
        var priceTill25: Double,
        var priceTill50: Double,
        var priceTill75: Double,
        var priceTill100: Double,
        var priceTill150: Double,
        var priceTill200: Double,
        var priceTill250: Double,
        var priceTill500: Double,
        var moreThan500: Double,
        var idTypeImpression: Int,
        var idCompany: Int
)