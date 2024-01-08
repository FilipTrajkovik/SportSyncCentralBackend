package ukim.finki.bp.sportsynccentralbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "sport_hall")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SportHall {

    @Id
    @Column(name = "id_sport_hall")
    private Integer id;

    private String name;

    private String location;

    private Integer capacity;

    @OneToMany(mappedBy = "seatSportHall", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Seat> seats;

    @OneToMany(mappedBy = "matchSportHall", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Match> matches;
}
