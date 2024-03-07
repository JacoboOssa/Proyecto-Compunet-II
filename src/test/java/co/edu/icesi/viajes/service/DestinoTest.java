package co.edu.icesi.viajes.service;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.dto.DestinoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DestinoTest {
    @Autowired
    DestinoService destinoService;

    @Test
    void debeRetornarDestinoPorCodigoYEstado() {
        Destino destino = destinoService.findDestinoByCodigoAndEstado("DEST1", "A");
        System.out.println(destino.getNombre());
    }

    @Test
    void debeRetornarDestinoPorEstado() {
        List<Destino> lstDestino = destinoService.findDestinoByEstado();
        for (Destino destino : lstDestino) {
            System.out.println(destino.getNombre() + " - " + destino.getCodigo() + " - " + destino.getDescripcion());
        }
    }

    @Test
    void debeRetornarDestinosPorTipoDestino() {
        List<DestinoDTO> lstDestino = destinoService.consultaDestinosPorTipoDest("PLAYA Y MAR");
        for (DestinoDTO destino : lstDestino) {
            System.out.println(destino.getNombre() + " - " + destino.getDescripcion());
        }
    }

}
