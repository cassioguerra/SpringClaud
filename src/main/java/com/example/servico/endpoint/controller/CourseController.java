package com.example.servico.endpoint.controller;



import com.example.servico.endpoint.service.CourserService;
import com.example.servico.model.Courser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/admin/course")
@Slf4j
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class CourseController {

    @Autowired
    private final CourserService courserService;

    public CourseController(CourserService courserService) {
        this.courserService = courserService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Courser>> list(Pageable pageable){
        return  new ResponseEntity<>(courserService.list(pageable), HttpStatus.OK);
    }
}
