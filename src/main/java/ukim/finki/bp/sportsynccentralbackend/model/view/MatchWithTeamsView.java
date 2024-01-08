package ukim.finki.bp.sportsynccentralbackend.model.view;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "match_with_teams")
@AllArgsConstructor
@NoArgsConstructor
@Immutable
public class MatchWithTeamsView {

    @Id
    private Long id;

    private Integer matchId;

    private String matchName;

    private LocalDate matchDate;

    private LocalTime startTime;

    private String sportType;

    private String category;

    private String homeTeamName;

    private String guestTeamName;

    private String sportHallName;

    private String sportHallLocation;
}
