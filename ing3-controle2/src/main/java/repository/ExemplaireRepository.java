package repository;

import entity.ExemplaireEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExemplaireRepository extends CrudRepository<ExemplaireEntity, Long> {
    List<ExemplaireEntity> findAll();
}
