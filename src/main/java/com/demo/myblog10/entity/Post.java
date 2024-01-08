package com.demo.myblog10.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use appropriate strategy for ID generation
    private Long id; // Use wrapper type (e.g., Long) for ID

    private String title;

    private String description;

    private String content;

    // Constructors, getters, setters, and other methods can be included here.
}
