package com.suyang

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.convert.converter.Converter
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

@SpringBootApplication
open class Application {

    /**
     * 默认String to data类型的转换
     * @return
     */
    @Bean
    open fun addNewConvert(): Converter<String, Date> {
        return Converter { source ->
            val sdf = SimpleDateFormat("yyyy-MM-dd")
            var date: Date? = null
            try {
                date = sdf.parse(source as String)
            } catch (e: ParseException) {
                e.printStackTrace()
            }

            date
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}
