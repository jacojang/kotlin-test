package com.jacojang.kotlin.upsource.comments.crawler

import org.springframework.stereotype.Service

@Service
class CrawlerService {
    constructor() {

    }

    fun getData(): CrawlResult {
        return CrawlResult("Test", 12);
    }
}