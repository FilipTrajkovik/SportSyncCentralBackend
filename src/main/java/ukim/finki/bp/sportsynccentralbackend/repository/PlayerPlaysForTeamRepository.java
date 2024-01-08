package ukim.finki.bp.sportsynccentralbackend.repository;

import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ukim.finki.bp.sportsynccentralbackend.model.PlayerPlaysForTeam;
import ukim.finki.bp.sportsynccentralbackend.model.PlayerPlaysForTeamKey;

import java.time.LocalDate;
import java.time.LocalTime;

@Repository
public interface PlayerPlaysForTeamRepository extends JpaRepository<PlayerPlaysForTeam, PlayerPlaysForTeamKey> {

    @Modifying
    @Transactional
    @Query(value = "call player_change_team(?1, ?2, ?3, ?4);", nativeQuery = true)
    void playerChangeTeam(Integer idTeam,
                            Integer idPlayer,
                            LocalDate dateFrom,
                            LocalDate dateTo
    );
}
