package ma.usmba.repositories;

import ma.usmba.models.CompteBancaire;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class CompteRepositoryImpl implements CompteRepository {
    @Override
    public CompteBancaire save(CompteBancaire compteBancaire) {
        return null;
    }

    @Override
    public List<CompteBancaire> findAll() {
        return null;
    }

    @Override
    public Optional<CompteBancaire> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<CompteBancaire> searchComptes(Predicate<CompteBancaire> predicate) {
        return null;
    }

    @Override
    public CompteBancaire update(CompteBancaire compteBancaire) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
