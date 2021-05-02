package com.doublesnatch.app.utils

import android.content.Context
import android.util.Log
import com.doublesnatch.app.R
import com.doublesnatch.app.model.CompanyView
import com.doublesnatch.app.model.ImpressionView
import com.doublesnatch.app.model.ProductView
import com.doublesnatch.app.model.TypeImpressionView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.nio.charset.Charset


object CSVUtils {

    @JvmStatic
    fun getTypeImpressions(context: Context): List<TypeImpressionView> {
        val list: MutableList<TypeImpressionView> = mutableListOf()
        val `is`: InputStream = context.resources.openRawResource(R.raw.type_impressions)
        val reader = BufferedReader(
                InputStreamReader(`is`, Charset.forName("UTF-8"))
        )

        try {
            reader.lines().forEach { line ->
                Log.d("MyActivity", "Line: $line")
                val tokens = line.split(",").toTypedArray()
                val type = TypeImpressionView(type = tokens[0])
                list.add(type)
                Log.d("getTypeImpressions", "Just created: ")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        reader.close()
        return list
    }

    @JvmStatic
    fun getCompanies(context: Context): List<CompanyView> {
        val list: MutableList<CompanyView> = mutableListOf()
        val `is`: InputStream = context.resources.openRawResource(R.raw.type_impressions)
        val reader = BufferedReader(
                InputStreamReader(`is`, Charset.forName("UTF-8"))
        )

        try {
            reader.lines().forEach { line ->
                Log.d("MyActivity", "Line: $line")
                val tokens = line.split(",").toTypedArray()
                val type = CompanyView(name = tokens[0])
                list.add(type)
                Log.d("getTypeImpressions", "Just created: ")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        reader.close()
        return list
    }

    @JvmStatic
    fun getImpressions(context: Context): List<ImpressionView> {
        val list: MutableList<ImpressionView> = mutableListOf()
        val `is`: InputStream = context.resources.openRawResource(R.raw.impressions)
        val reader = BufferedReader(
                InputStreamReader(`is`, Charset.forName("UTF-8"))
        )

        try {
            reader.lines().forEach { line ->
                Log.d("MyActivity", "Line: $line")
                val tokens = line.split(",").toTypedArray()
                val type = ImpressionView(
                        priceTill10 = tokens[0].toDouble(),
                        priceTill25 = tokens[1].toDouble(),
                        priceTill50 = tokens[2].toDouble(),
                        priceTill75 = tokens[3].toDouble(),
                        priceTill100 = tokens[4].toDouble(),
                        priceTill150 = tokens[5].toDouble(),
                        priceTill200 = tokens[6].toDouble(),
                        priceTill250 = tokens[7].toDouble(),
                        priceTill500 = tokens[8].toDouble(),
                        moreThan500 = tokens[9].toDouble(),
                        idTypeImpression = tokens[10].toInt(),
                        idCompany = tokens[11].toInt()
                )
                list.add(type)
                Log.d("getTypeImpressions", "Just created: ")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        reader.close()
        return list
    }


    @JvmStatic
    fun getProducts(context: Context): List<ProductView> {
        val list: MutableList<ProductView> = mutableListOf()
        val `is`: InputStream = context.resources.openRawResource(R.raw.products)
        val reader = BufferedReader(
                InputStreamReader(`is`, Charset.forName("UTF-8"))
        )

        try {
            reader.lines().forEach { line ->
                Log.d("MyActivity", "Line: $line")
                val tokens = line.split(",").toTypedArray()
                val type = ProductView(
                        name = tokens[0],
                        reference = tokens[1],
                        gender = tokens[2],
                        type = tokens[3],
                        detail = tokens[4],
                        url = tokens[5],
                        priceTill10 = tokens[6].toDouble(),
                        priceTill25 = tokens[7].toDouble(),
                        priceTill50 = tokens[8].toDouble(),
                        priceTill75 = tokens[9].toDouble(),
                        priceTill100 = tokens[10].toDouble(),
                        priceTill150 = tokens[11].toDouble(),
                        priceTill200 = tokens[12].toDouble(),
                        priceTill250 = tokens[13].toDouble(),
                        priceTill500 = tokens[14].toDouble(),
                        moreThan500 = tokens[15].toDouble()
                )
                list.add(type)
                Log.d("getTypeImpressions", "Just created: ")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        reader.close()
        return list
    }
}