package ukim.finki.bp.sportsynccentralbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ukim.finki.bp.sportsynccentralbackend.model.view.MatchWithHostTeamsAndPlayersView;

import java.util.List;

@Repository
public interface MatchWithHostTeamsAndPlayersRepository extends JpaRepository<MatchWithHostTeamsAndPlayersView, Long> {

    List<MatchWithHostTeamsAndPlayersView> findAllByMatchId(Integer matchId);
}
