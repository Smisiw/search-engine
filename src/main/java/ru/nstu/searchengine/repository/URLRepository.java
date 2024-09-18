package ru.nstu.searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nstu.searchengine.model.URL;

import java.util.List;

@Repository
public interface URLRepository extends JpaRepository<URL, Long> {
    List<URL> findAllByIsIndexedIsFalse();
}
