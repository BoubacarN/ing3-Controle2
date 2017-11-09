package model;

import entity.LivreEntity;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class ExemplaireDto {
    private Long id;
    private LivreEntity conseiller;
}
