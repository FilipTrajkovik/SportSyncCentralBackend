package ukim.finki.bp.sportsynccentralbackend.model.view;

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
@Table(name = "match_with_capacity")
@AllArgsConstructor
@NoArgsConstructor
@Immutable
public class MatchWithCapacityView {

    @Id
    private Long id;

    private Integer matchId;

    private String matchName;

    private LocalDate matchDate;

    private LocalTime matchStartTime;

    private String matchSportType;

    private Integer sportHallId;

    private String sportHallName;

    private Integer sportHallCapacity;

    private Integer seatId;

    private boolean seatIsAvaible;

    private String seatSector;

    private Integer seatRow;

    private Integer seatNumber;
}
