package co.edu.icesi.viajes.service;
import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ClienteService extends GenericService<Cliente, Integer>{
    Page<Cliente> findByEstadoOrderByNumeroIdentificacionAsc(String estado, Pageable pageable);
    Cliente findClienteByCorreoIgnoreCase(String correo);

    Cliente findClienteByNumeroIdentificacionLike(String numId);
    Cliente findClienteByNombreLikeIgnoreCase(String name);
    List<Cliente> findClientesByFechaNacimientoBetween(Date fechaInicial, Date fechaFinal);

    int countByEstado(String estado);
    List<Cliente> findClientesByPrimerApellidoAndSegundoApellido(String primerApellido, String segundoApellido);
    List<ClienteDTO> consultarClientesPorNombre(@Param("pNombre") String nombre);

    Page<ClienteDTO> consultarClientesPorTipoId(@Param("pNombre") String nombre, Pageable pageable);










}
