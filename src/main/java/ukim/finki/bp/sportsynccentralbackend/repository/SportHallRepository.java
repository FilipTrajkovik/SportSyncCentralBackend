package ukim.finki.bp.sportsynccentralbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ukim.finki.bp.sportsynccentralbackend.model.SportHall;

@Repository
public interface SportHallRepository extends JpaRepository<SportHall, Integer> {
}
