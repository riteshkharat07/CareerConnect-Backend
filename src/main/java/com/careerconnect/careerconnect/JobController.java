
package com.careerconnect.careerconnect;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class JobController {

    @GetMapping("/api/jobs")
    public List<Map<String, Object>> getJobs() {

        return List.of(
                Map.of(
                        "id", 1,
                        "title", "Java Developer",
                        "company", "TCS",
                        "location", "Pune"
                ),
                Map.of(
                        "id", 2,
                        "title", "React Developer",
                        "company", "Infosys",
                        "location", "Mumbai"
                ),
                Map.of(
                        "id", 3,
                        "title", "Backend Developer",
                        "company", "Accenture",
                        "location", "Nashik"
                )
        );
    }
}
