package ukim.finki.bp.sportsynccentralbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ukim.finki.bp.sportsynccentralbackend.model.Ticket;

import java.time.LocalDateTime;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    @Modifying
    @Transactional
    @Query(value = "call insert_new_ticket(?1, ?2, ?3, ?4, ?5, ?6, ?7);", nativeQuery = true)
    void insertNewTicket(
            LocalDateTime dateBought,
            Integer price,
            String locationBought,
            Integer idMatch,
            Integer idSpectator,
            Integer idSeat,
            Integer idSportHall
    );
}
