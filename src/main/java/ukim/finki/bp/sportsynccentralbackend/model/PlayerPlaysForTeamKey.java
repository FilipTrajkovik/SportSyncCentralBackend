package ukim.finki.bp.sportsynccentralbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PlayerPlaysForTeamKey implements Serializable {

    @Column(name = "id_player")
    Integer playerId;

    @Column(name = "id_team")
    Integer teamId;
}
