package ukim.finki.bp.sportsynccentralbackend.model.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "future_matches_remaining_capacity")
@AllArgsConstructor
@NoArgsConstructor
@Immutable
public class FutureMatchesRemainingCapacity {

    @Id
    private Long id;

    private String matchName;

    private LocalDate matchDate;

    private LocalTime startTime;

    private String sportHallName;

    private Integer totalCapacity;

    private Long soldSeats;

    private Long seatsLeft;
}
