package com.example.demo.service.stringmatching.impl;

import com.example.demo.service.stringmatching.StringMatcherService;
import com.example.library.Trie;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Data
@Service
public class StringMatchingServiceImpl implements StringMatcherService {
    private Trie trie;

    public StringMatchingServiceImpl() {
        this.trie = new Trie();
        log.info("StringMatchingServiceImpl initialized");
    }

    private void fillTrie(List<String> words) {
        this.trie = new Trie();
        words.forEach(word -> trie.insert(word));
        log.info(trie.toString());
    }

    public String getBiggestPrefix(String string, List<String> stringList) {
        log.info("biggest prefix for" + string);
        fillTrie(stringList);
        return this.trie.findLartgestPrefix(string);
    }

}
