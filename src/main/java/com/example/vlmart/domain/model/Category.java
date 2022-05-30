package com.example.vlmart.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
public class Category extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    @NotBlank
    private String name;

    @NotBlank
    private String slug;

    // Trạng thái
    @Column(columnDefinition = "integer default 1")
    private Integer status;
}
