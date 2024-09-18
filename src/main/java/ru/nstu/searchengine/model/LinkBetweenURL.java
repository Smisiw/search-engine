package ru.nstu.searchengine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "links_between_urls")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LinkBetweenURL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "from_url_id")
    private URL fromURL;
    @ManyToOne
    @JoinColumn(name = "to_url_id")
    private URL toURL;
}
