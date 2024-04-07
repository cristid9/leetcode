package main.api;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import main.service.UrlService;

import java.io.IOException;

@RestController
@RequestMapping(path = "/api/url")
@Slf4j
//@AllArgsConstructor
//@RequiredArgsConstructor
public class ShortURL {

    @Autowired
    private UrlService urlService;

    @PostMapping(path = "/short")
    public ResponseEntity<String> makeShort(@RequestParam String url) {
        var entty = urlService.createUrl(url);
        return new ResponseEntity<>(entty.getShortenedUrl(), HttpStatus.CREATED);
    }

    @GetMapping(path = "/redirect/{hash}")
    public void redirect(HttpServletResponse response, @PathVariable String hash) throws IOException {
        var entity = urlService.getLongUrlByShort(hash);
        System.out.println(entity.getOriginalUrl());
        System.out.println(entity.getShortenedUrl());
        log.info(entity.getOriginalUrl());
        log.info(entity.getShortenedUrl());
        response.sendRedirect(entity.getOriginalUrl());
    }
}
