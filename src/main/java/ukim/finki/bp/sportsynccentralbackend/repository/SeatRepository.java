package ukim.finki.bp.sportsynccentralbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ukim.finki.bp.sportsynccentralbackend.model.Seat;
import ukim.finki.bp.sportsynccentralbackend.model.SeatSportHallKey;

@Repository
public interface SeatRepository extends JpaRepository<Seat, SeatSportHallKey> {
}
