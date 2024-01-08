package ukim.finki.bp.sportsynccentralbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ukim.finki.bp.sportsynccentralbackend.model.view.MatchWithGuestTeamsAndPlayersView;

import java.util.List;

@Repository
public interface MatchWithGuestTeamsAndPlayersRepository extends JpaRepository<MatchWithGuestTeamsAndPlayersView, Long> {

    List<MatchWithGuestTeamsAndPlayersView> findAllByMatchId(Integer matchId);
}
