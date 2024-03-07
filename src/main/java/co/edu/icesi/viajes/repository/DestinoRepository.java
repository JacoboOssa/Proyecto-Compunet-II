package co.edu.icesi.viajes.repository;
import co.edu.icesi.viajes.dto.DestinoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.icesi.viajes.domain.Destino;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DestinoRepository extends JpaRepository<Destino, Integer>{
    //11. Consultar un destino por código y estado activo.
    Destino findDestinoByCodigoAndEstado(String codigo,String estado);
    //12. Consultar los destinos por tipo de destino
    @Query(nativeQuery = true)
    List<DestinoDTO> consultaDestinosPorTipoDest(@Param("pNombre") String nombre);

    //13. Consultar todos los destinos activos, mostrando que tipo de destino es.
    @Query("SELECT d FROM Destino d WHERE d.estado = 'A'")
    List<Destino> findDestinoByEstado();

}
