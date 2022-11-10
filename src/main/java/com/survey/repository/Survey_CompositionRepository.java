package com.survey.repository;

import com.survey.model.Survey_Composition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Survey_CompositionRepository extends JpaRepository<Survey_Composition, Long> {
    Page<Survey_Composition> findAll(Pageable pageable);
}
