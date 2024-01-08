package ukim.finki.bp.sportsynccentralbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ukim.finki.bp.sportsynccentralbackend.model.Spectator;

@Repository
public interface SpectatorRepository extends JpaRepository<Spectator, Integer> {
}
