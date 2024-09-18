package ru.nstu.searchengine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "links_words")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LinkWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "word_id")
    private Word word;
    @ManyToOne
    @JoinColumn(name = "link_id")
    private LinkBetweenURL link;
}
