package repository;

import entity.LivreEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LivreRepository extends CrudRepository<LivreEntity, Long> {
    List<LivreEntity> findAll();
}
