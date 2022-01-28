package com.example.apiRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiRest.exception.ObjectNotFoundException;
import com.example.apiRest.models.Cliente;
import com.example.apiRest.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	// Busca por ID do cliente
	public Cliente findById(Integer id) {
		Optional<Cliente> cliente = repo.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException(
				"Cliente não encontrado ID: " + id + "Tipo: " + Cliente.class.getName()));
	}

	// Busca uma lista de clientes
	public List<Cliente> findAll() {
		return repo.findAll();
	}

	// Método que vai fazer com que salve o cliente na base de dados
	public Cliente save(Cliente cliente) {
		cliente.setId(null);
		return repo.save(cliente);
	}

	// Foi criado um método auxiliar pra que possa fazer a atualização do cliente na
	// base de dados
	private void updateCliente(Cliente oldCliente, Cliente newCliente) {
		newCliente.setNome(oldCliente.getNome());
		newCliente.setDatanasc(oldCliente.getDatanasc());
		newCliente.setRg(oldCliente.getRg());
		newCliente.setCpf(oldCliente.getCpf());
		newCliente.setTelefone(oldCliente.getTelefone());
	}

	public Cliente update(Cliente cliente) {
		Cliente newCliente = new Cliente();
		updateCliente(cliente, newCliente);
		return repo.save(newCliente);

	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
