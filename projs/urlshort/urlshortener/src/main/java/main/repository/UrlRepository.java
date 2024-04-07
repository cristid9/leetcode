package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlRepository extends JpaRepository<UrlEntity, Long> {

    Optional<UrlEntity> findByOriginalUrl(String originalUrl);

    Optional<UrlEntity> findByShortenedUrl(String shortenedUrl);

}
