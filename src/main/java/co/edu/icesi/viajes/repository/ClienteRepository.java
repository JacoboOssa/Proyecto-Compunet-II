package co.edu.icesi.viajes.repository;
import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    //2.    Consultar a todos los clientes por estado. Esta consulta debe ser paginada y ordenada de forma ascendente por número de identificación.
    Page<Cliente> findByEstadoOrderByNumeroIdentificacionAsc(String estado, Pageable pageable);
    //3.    Consultar a un cliente por correo electrónico. Esta consulta debe ignorar las mayúsculas y minúsculas.
    Cliente findClienteByCorreoIgnoreCase(String correo);
    //4.    Consultar cliente por número de identificación, usando LIKE
    Cliente findClienteByNumeroIdentificacionLike(String numId);
    //5.    Consultar al cliente por nombre, ignorando Mayúsculas y minúsculas, usando LIKE.
    Cliente findClienteByNombreLikeIgnoreCase(String name);

    //6.    Consultar clientes por rango de fecha (Se debe pasar dos fechas y traer los clientes cuya fecha de nacimiento se encuentre entre el rango ingresado).
    List<Cliente> findClientesByFechaNacimientoBetween(Date fechaInicial, Date fechaFinal);
    //8.    Consultar el total de clientes por estado.
    int countByEstado(String estado);
    //9.    Consultar clientes por tipo de identificación. Debe de ser paginado
    @Query(nativeQuery = true)
    Page<ClienteDTO> consultarClientesPorTipoId(@Param("pNombre") String nombre, Pageable pageable);

    //10. Consultar clientes por apellido (tener en cuenta los campos primer y segundo apellido)
    List<Cliente> findClientesByPrimerApellidoAndSegundoApellido(String primerApellido, String segundoApellido);

    //15. Consulta Plan y Detalles de Plan dado el ID del CLiente
    @Query(nativeQuery = true)
    List<ClienteDTO> consultarPlanPorCliente(@Param("pNumeroId") String id);
    //16. Consultar todos los clientes con los siguientes filtros:
    // Estado, número identificación, tipo de identificación, nombre (con Like)
    // en orden ascendente. (debe de ser una sola consulta y los filtros pueden ser opcionales).
    @Query(nativeQuery = true)
    List<ClienteDTO> consultarClientesPorNombre(@Param("pEstado") String estado, @Param("pId") String id, @Param("pCodigo") String codigo, @Param("pNombre") String nombre);
}
