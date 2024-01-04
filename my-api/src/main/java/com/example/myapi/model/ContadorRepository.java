package main.java.com.example.myapi.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContadorRepository extends JpaRepository<Contador, Long> {
}
