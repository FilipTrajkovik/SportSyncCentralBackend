package ukim.finki.bp.sportsynccentralbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ukim.finki.bp.sportsynccentralbackend.model.view.MatchWithCapacityView;

import java.util.List;

@Repository
public interface MatchWithCapacityRepository extends JpaRepository<MatchWithCapacityView, Long> {

    List<MatchWithCapacityView> findAllByMatchId(Integer matchId);
}
