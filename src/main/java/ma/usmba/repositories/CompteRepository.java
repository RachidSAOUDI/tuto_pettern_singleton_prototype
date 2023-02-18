package ma.usmba.repositories;

import ma.usmba.models.CompteBancaire;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface CompteRepository {
    CompteBancaire save(CompteBancaire compteBancaire);
    List<CompteBancaire> findAll();
    Optional<CompteBancaire> findById(Long id);
    List<CompteBancaire> searchComptes(Predicate<CompteBancaire> predicate);
    CompteBancaire update(CompteBancaire compteBancaire);
    void deleteById(Long id);
}
