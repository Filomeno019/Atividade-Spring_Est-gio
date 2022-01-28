package com.example.apiRest.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.apiRest.models.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	Optional<Cliente> findById(Integer id);
	Optional<Cliente> findByNome(String nome);
	Optional<Cliente> findByDatanasc(String datanasc);
	Optional<Cliente> findByTelefone(String nome);
}
 