package com.jacojang.kotlin.upsource.comments.controller

import com.jacojang.kotlin.upsource.comments.crawler.CrawlResult
import com.jacojang.kotlin.upsource.comments.crawler.CrawlerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController @Autowired constructor(
        private val crawlerService: CrawlerService
) {
    @GetMapping("/")
    fun blog(): CrawlResult {
        return crawlerService.getData();
    }

}