package ukim.finki.bp.sportsynccentralbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ukim.finki.bp.sportsynccentralbackend.model.Match;
import ukim.finki.bp.sportsynccentralbackend.model.Player;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {

    @Modifying
    @Transactional
    @Query(value = "call insert_new_match(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9);", nativeQuery = true)
    void insertNewMatch(String name,
                        String category,
                        String sportType,
                        LocalDate matchDate,
                        LocalTime startTime,
                        LocalTime endTime,
                        Integer idGuestTeam,
                        Integer idHomeTeam,
                        Integer idSportHall
    );

}
