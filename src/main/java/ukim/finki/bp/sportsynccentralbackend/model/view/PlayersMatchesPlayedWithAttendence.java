package ukim.finki.bp.sportsynccentralbackend.model.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Entity
@Data
@Table(name = "players_matches_played_with_attendence")
@AllArgsConstructor
@NoArgsConstructor
@Immutable
public class PlayersMatchesPlayedWithAttendence {

    @Id
    private Long id;

    private String name;

    private String surname;

    private Long matchesPlayed;

    private Long totalVisits;
}
