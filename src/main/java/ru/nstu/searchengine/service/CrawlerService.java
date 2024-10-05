package ru.nstu.searchengine.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;
import ru.nstu.searchengine.model.URL;
import ru.nstu.searchengine.repository.URLRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CrawlerService implements Crawler {
    private final URLRepository urlRepository;

    @Override
    public String getTextOnly(Document document) {
        return "";
    }

    @Override
    @SneakyThrows
    public List<URL> getInnerUrls(String url) {
        Document doc = Jsoup.connect(url).get();

        // вынести логику в URLService
        List<URL> urls = doc.body().getElementsByTag("a").parallelStream()
                .map(e -> e.attr("abs:href"))
//                .distinct()
                .map(s -> {
                    URL u = new URL();
                    u.setUrl(s);
                    u.setIsIndexed(false);
                    return u;
                })
                .toList();

        return urlRepository.saveAll(urls);
    }

    @Override
    @SneakyThrows
    public String test(String url) {
        return "";
    }
}
