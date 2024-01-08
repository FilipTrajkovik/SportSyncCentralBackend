package ukim.finki.bp.sportsynccentralbackend.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "match")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Match {

    @Id
    @Column(name = "id_match")
    private Integer id;

    private String name;

    private String category;

    private String sportType; // sportType

    private LocalDate matchDate;

    private LocalTime startTime;

    private LocalTime endTime;

    @ManyToOne
    @JoinColumn(name = "id_home_team", nullable = false)
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "id_guest_team", nullable = false, insertable=false, updatable=false)
    private Team guestTeam;

    @ManyToOne
    @JoinColumn(name = "id_sport_hall", nullable = false, insertable=false, updatable=false)
    private SportHall matchSportHall;

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Ticket> tickets;

}
