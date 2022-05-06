package br.com.projetosportfolio.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetosportfolio.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
