package dev.toke.spring6app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Spring6AppApplication

fun main(args: Array<String>) {
    runApplication<Spring6AppApplication>(*args)
}
