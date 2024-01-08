package ukim.finki.bp.sportsynccentralbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "spectator")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Spectator {

    @Id
    @Column(name = "id_spectator")
    private Integer id;

    private String name;

    private String surname;

    private String phoneNumber;

    private String email;

    @OneToMany(mappedBy = "spectator")
    @JsonIgnoreProperties
    private List<Ticket> tickets;
}
