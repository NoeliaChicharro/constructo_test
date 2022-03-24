package ch.constructo.initProject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenutzerRepository extends CrudRepository<Benutzer, Long> {
}
