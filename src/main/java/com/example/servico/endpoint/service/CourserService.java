package com.example.servico.endpoint.service;

import com.example.servico.model.Courser;
import com.example.servico.repository.CourserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
//@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class CourserService {
    @Autowired
    private final CourserRepository courserRepository;

    public CourserService(CourserRepository courserRepository) {
        this.courserRepository = courserRepository;
    }

    public Iterable<Courser> list(Pageable pageable){
        log.info("listando o curso");
        return courserRepository.findAll(pageable);
    }

}
