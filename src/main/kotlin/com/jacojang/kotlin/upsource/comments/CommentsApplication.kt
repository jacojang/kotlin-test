package com.jacojang.kotlin.upsource.comments

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommentsApplication

fun main(args: Array<String>) {
    runApplication<CommentsApplication>(*args)
}
