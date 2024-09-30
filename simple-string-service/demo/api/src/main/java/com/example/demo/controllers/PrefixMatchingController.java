package com.example.demo.controllers;

import com.example.demo.service.stringmatching.StringMatcherService;
import com.example.demo.service.stringmatching.impl.StringMatchingServiceImpl;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import static com.example.demo.utils.ApiConstants.STRING_MATCHING_API;


@RestController
@RequestMapping("v1")
public class PrefixMatchingController {

    private StringMatcherService stringMatcherService;

    @Autowired
    public PrefixMatchingController(StringMatchingServiceImpl stringMatcherService) {
        this.stringMatcherService = stringMatcherService;
    }

    @GetMapping("/prefix")
    public ResponseEntity<String> getMatchingPrefix(
            @RequestParam(name = "needle") String needle,
            @RequestParam(name = "haystack") List<String> haystack) {
        return ResponseEntity.ok(stringMatcherService.getBiggestPrefix(needle, haystack));
    }
}
