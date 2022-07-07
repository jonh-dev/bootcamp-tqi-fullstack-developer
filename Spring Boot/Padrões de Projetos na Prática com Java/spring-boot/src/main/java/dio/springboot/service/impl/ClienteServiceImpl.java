package dio.springboot.service.impl;

import dio.springboot.model.Cliente;
import dio.springboot.model.ClienteRepository;
import dio.springboot.model.Endereco;
import dio.springboot.model.EnderecoRepository;
import dio.springboot.service.ClienteService;
import dio.springboot.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


    /**
     * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
     * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
     * {@link Service}, ela será tratada como um <b>Singleton</b>.
     *
     * @author Jonh Dev
     */
@Service
public class ClienteServiceImpl implements ClienteService {

        // Singleton: Injetar os componentes do Spring com @Autowired.
        @Autowired
        private ClienteRepository clienteRepository;
        @Autowired
        private EnderecoRepository enderecoRepository;
        @Autowired
        private ViaCepService viaCepService;

        // Strategy: Implementar os métodos definidos na interface.
        // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

        @Override
        public Iterable<Cliente> buscarTodos() {
            // Buscar todos os Clientes.
            return clienteRepository.findAll();
        }

        @Override
        public Cliente buscarPorId(Long id) {
            // Buscar Cliente por ID.
            Optional<Cliente> cliente = clienteRepository.findById(id);
            return cliente.get();
        }

        @Override
        public void inserir(Cliente cliente) {
            salvarClienteComCep(cliente);
        }

        @Override
        public void atualizar(Long id, Cliente cliente) {
            // Buscar Cliente por ID, caso exista:
            Optional<Cliente> clienteBd = clienteRepository.findById(id);
            if (clienteBd.isPresent()) {
                salvarClienteComCep(cliente);
            }
        }

        @Override
        public void deletar(Long id) {
            // Deletar Cliente por ID.
            clienteRepository.deleteById(id);
        }

        private void salvarClienteComCep(Cliente cliente) {
            // Verificar se o Endereco do Cliente já existe (pelo CEP).
            String cep = cliente.getEndereco().getCep();
            Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
                // Caso não exista, integrar com o ViaCEP e persistir o retorno.
                Endereco novoEndereco = viaCepService.consultarCep(cep);
                enderecoRepository.save(novoEndereco);
                return novoEndereco;
            });
            cliente.setEndereco(endereco);
            // Inserir Cliente, vinculando o Endereco (novo ou existente).
            clienteRepository.save(cliente);
        }

    }
