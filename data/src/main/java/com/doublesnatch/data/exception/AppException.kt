package com.doublesnatch.data.exception

class AppException(code: Int, detailMessage: String) : RuntimeException(detailMessage) {
     var mCode: Int? = code
}