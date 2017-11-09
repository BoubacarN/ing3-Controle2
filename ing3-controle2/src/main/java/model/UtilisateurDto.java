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
public class UtilisateurDto {
    private Long id;
    private String nom;
    private String prenom;
    private List<ExemplaireEntity> compte = new ArrayList<>();
}
