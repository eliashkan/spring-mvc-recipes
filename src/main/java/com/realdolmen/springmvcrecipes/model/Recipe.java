package com.realdolmen.springmvcrecipes.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Difficulty difficulty;

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Note note;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "recipe"
    )
    private Set<Ingredient> ingredients;
}
