package ru.nstu.searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nstu.searchengine.model.WordLocation;

@Repository
public interface WordLocationRepository extends JpaRepository<WordLocation, Long> {
}
