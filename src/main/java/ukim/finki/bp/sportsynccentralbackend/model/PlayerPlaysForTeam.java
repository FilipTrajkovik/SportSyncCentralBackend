package ukim.finki.bp.sportsynccentralbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "player_plays_for_team")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerPlaysForTeam {

    @EmbeddedId
    PlayerPlaysForTeamKey id;

    @ManyToOne
    @MapsId("playerId")
    @JoinColumn(name = "id_player")
    private Player player;

    @ManyToOne
    @MapsId("teamId")
    @JoinColumn(name = "id_team")
    private Team team;

    @Column(name = "date_from")
    LocalDate dateFrom;

    @Column(name = "date_to")
    LocalDate dateTo;

}
