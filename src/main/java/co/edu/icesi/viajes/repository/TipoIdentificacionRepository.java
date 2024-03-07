package co.edu.icesi.viajes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.icesi.viajes.domain.TipoIdentificacion;

import java.util.List;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer>{
    //1.    Consultar todos los tipo de identificación por estado ordenados alfabéticamente.
    public List<TipoIdentificacion> findByEstadoOrderByNombreAsc(String estado);
    //7.    Consultar tipo de identificación por código y estado.
}
