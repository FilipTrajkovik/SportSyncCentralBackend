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
@Table(name = "player")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    @Id
    @Column(name = "id_player")
    private Integer id;

    @OneToMany(mappedBy = "player")
    @JsonIgnore
    List<PlayerPlaysForTeam> playerPlaysForTeams;

    private String name;

    private String surname;

    private String hometown;

    private LocalDate dateOfBirth;

    private String position;

}
