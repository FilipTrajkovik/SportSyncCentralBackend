package ukim.finki.bp.sportsynccentralbackend.model.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Entity
@Data
@Table(name = "spectator_attendence")
@AllArgsConstructor
@NoArgsConstructor
@Immutable
public class SpectatorAttendenceView {

    @Id
    private Long id;

    private String spectatorName;

    private String spectatorSurname;

    private String seatSector;

    private Integer seatNumber;

    private Integer seatRow;

    private String sportHallName;

    private String sportHallLocation;

    private String matchName;

    private String matchSportType;
}
