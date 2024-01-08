package ukim.finki.bp.sportsynccentralbackend.service.impl;

import org.springframework.stereotype.Service;
import ukim.finki.bp.sportsynccentralbackend.model.SportHall;
import ukim.finki.bp.sportsynccentralbackend.repository.SportHallRepository;
import ukim.finki.bp.sportsynccentralbackend.service.SportHallService;

import java.util.List;

@Service
public class SportHallServiceImpl implements SportHallService {

    private final SportHallRepository sportHallRepository;

    public SportHallServiceImpl(SportHallRepository sportHallRepository) {
        this.sportHallRepository = sportHallRepository;
    }

    @Override
    public List<SportHall> findAll() {
        return this.sportHallRepository.findAll();
    }
}
