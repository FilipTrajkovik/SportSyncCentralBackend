package ukim.finki.bp.sportsynccentralbackend.model.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "match_with_host_teams_and_players")
@AllArgsConstructor
@NoArgsConstructor
@Immutable
public class MatchWithHostTeamsAndPlayersView {

    @Id
    private Long id;

    private Integer matchId;

    private String matchName;

    private LocalDate matchDate;

    private String sportType;

    private String category;

    private String homeTeamName;

    private String playerHostName;

    private String playerHostSurname;
}
