package com.webrtc.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching //启用Spring 缓存技术
class WebrtcServerApplication

fun main(args: Array<String>) {
    runApplication<WebrtcServerApplication>(*args)
}
