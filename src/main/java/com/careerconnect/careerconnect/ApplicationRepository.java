package com.careerconnect.careerconnect;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository
        extends JpaRepository<Application, Long> {
}