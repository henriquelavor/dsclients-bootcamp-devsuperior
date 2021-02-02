package br.com.henriquelavor.dsclients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.henriquelavor.dsclients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	
}
