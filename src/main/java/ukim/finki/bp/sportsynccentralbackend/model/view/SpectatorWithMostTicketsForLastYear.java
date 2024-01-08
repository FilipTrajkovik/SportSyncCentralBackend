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
@Table(name = "spectator_with_most_tickets_for_last_year")
@AllArgsConstructor
@NoArgsConstructor
@Immutable
public class SpectatorWithMostTicketsForLastYear {

    @Id
    private Long id;

    private String spectatorName;

    private String spectatorSurname;

    private Long max;
}
