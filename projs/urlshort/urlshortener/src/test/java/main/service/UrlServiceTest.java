package main.service;


import main.repository.UrlEntity;
import main.repository.UrlRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UrlServiceTest {
    
    @Mock
    private UrlRepository urlRepository;

    private UrlService urlService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        urlService = new UrlService(urlRepository);
    }
    

    @Test
    public void getLongUrlByShortTest() {

        final String shortened = "http://149.202.9.27:8080/api/url/short?url=http://www.livejasmin.com";

        Optional<UrlEntity> urlEntity = Optional.of(new UrlEntity());

        UrlRepository urlRepository = mock(UrlRepository.class);
        when(urlRepository.findOptionalByShortenedUrl(shortened)).thenReturn(urlEntity);

        UrlService urlService = new UrlService(urlRepository);

        var value = urlService.getLongUrlByShort(shortened);

        assertEquals(urlEntity.orElse(null).getId(), value.getId());
        assertEquals(urlEntity.orElse(null).getOriginalUrl(), value.getOriginalUrl());
        assertEquals(urlEntity.orElse(null).getShortenedUrl(), value.getShortenedUrl());

    }

}
