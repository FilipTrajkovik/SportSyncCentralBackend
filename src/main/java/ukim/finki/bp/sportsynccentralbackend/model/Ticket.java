package ukim.finki.bp.sportsynccentralbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    @Id
    @Column(name = "id_ticket")
    private Integer id;

    private LocalDateTime dateBought;

    private Integer price;

    private String locationBought;

    @ManyToOne
    @JoinColumn(name = "id_match", nullable = false)
    @JsonIgnore
    private Match match;

    @OneToOne
    @JoinColumns(value = {
            @JoinColumn(name="id_seat"),
            @JoinColumn(name = "id_sport_hall")
    })
    @JsonIgnore
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "id_spectator", nullable = false)
    @JsonIgnore
    private Spectator spectator;
}
