package com.doublesnatch.data.entity

import java.io.Serializable

data class ErrorResponse(
    var message: String? = null
) : Serializable