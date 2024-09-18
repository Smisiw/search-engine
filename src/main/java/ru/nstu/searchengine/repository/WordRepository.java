package ru.nstu.searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nstu.searchengine.model.Word;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {

}
