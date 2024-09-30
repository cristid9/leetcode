package com.example.sample1mvn.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Purchase {

    private int id;
    private String product;
    private BigDecimal price;
}