package co.edu.icesi.viajes.service;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.dto.DestinoDTO;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DestinoService extends GenericService<Destino, Integer>{
    Destino findDestinoByCodigoAndEstado(String codigo,String estado);
    List<DestinoDTO> consultaDestinosPorTipoDest(@Param("pNombre") String nombre);
    List<Destino> findDestinoByEstado();

}
