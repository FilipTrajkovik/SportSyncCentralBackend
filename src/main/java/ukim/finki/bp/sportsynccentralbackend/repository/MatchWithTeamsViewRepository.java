package ukim.finki.bp.sportsynccentralbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ukim.finki.bp.sportsynccentralbackend.model.view.MatchWithTeamsView;

@Repository
public interface MatchWithTeamsViewRepository extends JpaRepository<MatchWithTeamsView, Long> {
}
