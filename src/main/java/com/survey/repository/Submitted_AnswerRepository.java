package com.survey.repository;

import com.survey.model.Submitted_Answer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Submitted_AnswerRepository extends JpaRepository<Submitted_Answer, Long> {
    Page<Submitted_Answer> findAll(Pageable pageable);
}
