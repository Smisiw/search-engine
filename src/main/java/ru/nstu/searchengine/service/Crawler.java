package ru.nstu.searchengine.service;

import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;
import ru.nstu.searchengine.model.URL;

import java.io.IOException;
import java.util.List;

@Component
public interface Crawler {
    String getTextOnly(Document document);
    List<URL> getInnerUrls(String url) throws IOException;
    String test(String url);
    //todo: add methods
}
