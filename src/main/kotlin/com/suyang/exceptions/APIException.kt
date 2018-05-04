package com.suyang.exceptions

class APIException(type: APIExceptionType) : Exception() {

    var type: APIExceptionType? = null

    init {
        this.type = type
    }

    companion object {

        private val serialVersionUID = 1L
    }
}
