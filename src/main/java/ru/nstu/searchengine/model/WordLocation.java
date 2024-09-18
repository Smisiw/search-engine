package ru.nstu.searchengine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "word_locations")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WordLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "word_id")
    private Word word;
    @ManyToOne
    @JoinColumn(name = "url_id")
    private URL url;
    private Long location;
}
