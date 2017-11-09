package repository;


import entity.UtilisateurEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UtilisateurRepository extends CrudRepository<UtilisateurEntity, Long> {
    List<UtilisateurEntity> findAll();
}
