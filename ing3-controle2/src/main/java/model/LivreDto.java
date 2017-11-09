package model;

import entity.ExemplaireEntity;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@ToString
public class LivreDto {
    private Long id;
    private String titre;
    private String catégorie;
    private List<ExemplaireEntity> compte = new ArrayList<>();
}
