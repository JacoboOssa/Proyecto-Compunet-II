package co.edu.icesi.viajes.repository;
import co.edu.icesi.viajes.dto.TipoDestinoDTO;
import jakarta.persistence.NamedNativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.icesi.viajes.domain.TipoDestino;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TipoDestinoRepository extends JpaRepository<TipoDestino, Integer> {
    public List<TipoDestino>findByCodigo(String codigo);
    public List<TipoDestino>findByCodigoAndEstado(String codigo, String estado);

    //12. Consultar los destinos por tipo de destino
    @Query(nativeQuery = true)
    List<TipoDestinoDTO> consultarTipoDestinoPorEstado(@Param("pEstado") String estado);

    //14. Consultar los tipos de destino ordenados alfabéticamente.
    List<TipoDestino> findAllByOrderByNombreAsc();


}
