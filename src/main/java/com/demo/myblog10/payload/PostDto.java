package com.demo.myblog10.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private Long id; // Use wrapper type (e.g., Long) for ID

    private String title;

    private String description;

    private String content;

}
