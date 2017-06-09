package sample.multimodule.repository;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

import sample.multimodule.domain.entity.Personne;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Long> {

  Personne findByNumber(String number);

}
