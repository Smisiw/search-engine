package ru.nstu.searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nstu.searchengine.model.LinkWord;

@Repository
public interface LinkWordRepository extends JpaRepository<LinkWord, Long> {
}
