package ukim.finki.bp.sportsynccentralbackend.service.impl;

import org.springframework.stereotype.Service;
import ukim.finki.bp.sportsynccentralbackend.model.Seat;
import ukim.finki.bp.sportsynccentralbackend.repository.SeatRepository;
import ukim.finki.bp.sportsynccentralbackend.service.SeatService;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

    private final SeatRepository seatRepository;

    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public List<Seat> findAll() {
        return this.seatRepository.findAll();
    }
}
