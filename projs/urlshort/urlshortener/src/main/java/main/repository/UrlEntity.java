package main.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "url")
@Getter
@Setter
public class UrlEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String originalUrl;

    @Column
    private String shortenedUrl;
}
