package ru.nstu.searchengine.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nstu.searchengine.repository.WordRepository;

@Service
@RequiredArgsConstructor
public class WordService {
    private final WordRepository wordRepository;

}
