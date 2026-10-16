package com.careerconnect.careerconnect;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin(origins = "http://localhost:5173")
public class ApplicationController {

    private final ApplicationRepository applicationRepository;

    public ApplicationController(
            ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @PostMapping
    public Application applyJob(
            @RequestBody Application application) {

        return applicationRepository.save(application);
    }
}