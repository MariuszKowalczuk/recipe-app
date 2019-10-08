package pl.mk.recipeApp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Mariusz Kowalczuk
 */
@Getter
@Setter
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;

}
