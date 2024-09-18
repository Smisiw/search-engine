package ru.nstu.searchengine.service;

import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

@Component
public interface Crawler {
    String getTextOnly(Document document);
    //todo: add methods
}
