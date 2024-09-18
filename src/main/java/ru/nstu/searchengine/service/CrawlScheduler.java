package ru.nstu.searchengine.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CrawlScheduler {

    @Scheduled(fixedRate = 1000L)
    public void crawl() {
        //todo:
        //  1. URLService.findAllByIsIndexedIsFalse() - список урлов для скана
        //  2. Индексация с валидацией
    }
}
