package ru.nstu.searchengine.controller;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nstu.searchengine.model.URL;
import ru.nstu.searchengine.service.Crawler;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/crawl")
@RequiredArgsConstructor
public class CrawlerController {
    private final Crawler crawler;

    @GetMapping
    public List<URL> getInnerUrls(@PathParam("url") String url) throws IOException {
        return crawler.getInnerUrls(url);
    }
}
