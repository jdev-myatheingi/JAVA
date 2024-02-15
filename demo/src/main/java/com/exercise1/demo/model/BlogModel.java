package com.exercise1.demo.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
@Table(name = "tbl_blog")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data

public class BlogModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "blog_title")
    private String blogTitle;
    private String blog_author;
    private String blog_content;
}
