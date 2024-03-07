package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.dto.TipoDestinoDTO;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TipoDestinoService extends GenericService<TipoDestino, Integer>{

    List<TipoDestino> findByCodigo(String codigo);
    List<TipoDestino> findByCodigoAndEstado(String codigo, String estado);

    List<TipoDestino> findAllByOrderByNombreAsc();
    List<TipoDestinoDTO> consultarTipoDestinoPorEstado(@Param("pEstado") String estado);


}
