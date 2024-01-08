package ukim.finki.bp.sportsynccentralbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "seat")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {

    @EmbeddedId
    SeatSportHallKey id;

    private String sector;

    private Integer row;

    private Integer number;

    private boolean isAvaible;

    @ManyToOne
    @JoinColumn(name = "id_sport_hall", nullable = false)
    @JsonIgnore
    private SportHall seatSportHall;

    @OneToOne(mappedBy = "seat")
    @JsonIgnore
    private Ticket ticket;

}
