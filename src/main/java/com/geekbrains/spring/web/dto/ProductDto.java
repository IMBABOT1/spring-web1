package com.geekbrains.spring.web.dto;

import com.geekbrains.spring.web.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {
    private Long id;
    private String title;
    private Integer price;
    private String category;

}
