package ukim.finki.bp.sportsynccentralbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SeatSportHallKey implements Serializable {

    @Column(name = "id_seat")
    Integer seatId;

    @Column(name = "id_sport_hall", insertable=false, updatable=false)
    Integer sportHallId;
}
