package ukim.finki.bp.sportsynccentralbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ukim.finki.bp.sportsynccentralbackend.model.Player;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
