package defi.example.defi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import defi.example.defi.model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}

