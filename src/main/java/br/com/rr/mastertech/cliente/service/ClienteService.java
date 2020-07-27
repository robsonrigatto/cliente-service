package br.com.rr.mastertech.cliente.service;

import br.com.rr.mastertech.cliente.domain.Cliente;
import br.com.rr.mastertech.cliente.exception.ClienteNaoEncontradoException;
import br.com.rr.mastertech.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente findById(Integer id) {
        Optional<Cliente> optionalCliente = clienteRepository.findById(id);
        if(!optionalCliente.isPresent()) {
            throw new ClienteNaoEncontradoException();
        }

        return optionalCliente.get();
    }

    public Cliente create(String name) {
        Cliente cliente = new Cliente();
        cliente.setName(name);
        return this.clienteRepository.save(cliente);
    }
}
