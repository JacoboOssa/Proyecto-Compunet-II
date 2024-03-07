package co.edu.icesi.viajes.service;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import co.edu.icesi.viajes.dto.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.repository.ClienteRepository;

@Scope("singleton")
@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> findAll() {
        List<Cliente> lstCliente = clienteRepository.findAll();
        return lstCliente;
    }

    @Override
    public Optional<Cliente> findById(Integer integer) {
        return clienteRepository.findById(integer);
    }

    @Override
    public Cliente save(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public Cliente update(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public void delete(Cliente entity) throws Exception {
        clienteRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        clienteRepository.deleteById(integer);

    }

    @Override
    public void validate(Cliente entity) throws Exception {

    }

    @Override
    public long count() {
        return clienteRepository.count();
    }


    @Override
    public Page<Cliente> findByEstadoOrderByNumeroIdentificacionAsc(String estado, Pageable pageable) {
        return clienteRepository.findByEstadoOrderByNumeroIdentificacionAsc(estado, pageable);
    }

    @Override
    public Cliente findClienteByCorreoIgnoreCase(String correo) {
        return clienteRepository.findClienteByCorreoIgnoreCase(correo);
    }

    @Override
    public Cliente findClienteByNumeroIdentificacionLike(String numId) {
        return clienteRepository.findClienteByNumeroIdentificacionLike(numId);
    }

    @Override
    public Cliente findClienteByNombreLikeIgnoreCase(String name) {
        return clienteRepository.findClienteByNombreLikeIgnoreCase(name);
    }

    @Override
    public List<Cliente> findClientesByFechaNacimientoBetween(Date fechaInicial, Date fechaFinal) {
        return clienteRepository.findClientesByFechaNacimientoBetween(fechaInicial,fechaFinal);
    }

    @Override
    public int countByEstado(String estado) {
        return clienteRepository.countByEstado(estado);
    }


    @Override
    public List<Cliente> findClientesByPrimerApellidoAndSegundoApellido(String primerApellido, String segundoApellido) {
        return clienteRepository.findClientesByPrimerApellidoAndSegundoApellido(primerApellido, segundoApellido);
    }

    @Override
    public List<ClienteDTO> consultarClientesPorNombre(String nombre) {
        return clienteRepository.consultarClientesPorNombre(nombre);
    }

    @Override
    public Page<ClienteDTO> consultarClientesPorTipoId(String nombre, Pageable pageable) {
        return clienteRepository.consultarClientesPorTipoId(nombre, pageable);
    }


}
