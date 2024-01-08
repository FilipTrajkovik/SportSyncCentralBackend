package ukim.finki.bp.sportsynccentralbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "team")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    @Column(name = "id_team")
    private Integer id;

    @OneToMany(mappedBy = "team")
    @JsonIgnore
    List<PlayerPlaysForTeam> playerPlaysForTeams;

    private String name;

    private String hometown;

    private Integer trophiesWon;

    private LocalDate founded;

    @OneToMany(mappedBy = "homeTeam", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Match> homeMatches;

    @OneToMany(mappedBy = "guestTeam", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Match> guestMatches;

}
