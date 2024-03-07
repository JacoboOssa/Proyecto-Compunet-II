package co.edu.icesi.viajes.service;
import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.dto.TipoDestinoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class TipoDestinoTest {

    @Autowired
    private TipoDestinoService tipoDestinoService;

    /*
    @Test
    void debeRetornarListaDeTiposDestino() {
        List<TipoDestino> lstTipoDestino = tipoDestinoService.findAll();

        for(TipoDestino tipoDestino : lstTipoDestino) {
            System.out.println(tipoDestino.getCodigo() + "-" + tipoDestino.getNombre());
        }
    }

    @Test
    void debeRetornarTipoDestinoPorCodigo() {
        TipoDestino tipoDestino = tipoDestinoService.findById(2).get();
        System.out.println(tipoDestino.getCodigo() + "-" + tipoDestino.getNombre());
    }

    @Test
    void debeRetornarTipoDestinoGuardado() throws Exception {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = formato.parse("24/02/2024");

        TipoDestino tipoDestino = new TipoDestino();
        tipoDestino.setIdTide(9);
        tipoDestino.setCodigo("PRM");
        tipoDestino.setNombre("Ecoturismo");
        tipoDestino.setDescripcion("Tipo de destino turistico");
        tipoDestino.setFechaCreacion(fecha);
        tipoDestino.setFechaModificacion(null);
        tipoDestino.setUsuCreador("admin");
        tipoDestino.setUsuModificador("admin");
        tipoDestino.setEstado("A");
        tipoDestinoService.save(tipoDestino);
        System.out.println( "Destino:" + tipoDestino.getCodigo() + "-" + tipoDestino.getNombre() + " Guardado");
    }

    @Test
    void debeRetornarTipoDestinoActualizado() throws Exception {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = formato.parse("24/02/2024");

        TipoDestino tipoDestino = new TipoDestino();
        tipoDestino.setIdTide(9);
        tipoDestino.setCodigo("PRM");
        tipoDestino.setNombre("Ecoturismo");
        tipoDestino.setDescripcion("Un paramo frio de montaña, avistamiento de fauna y flora");
        tipoDestino.setFechaCreacion(fecha);
        tipoDestino.setFechaModificacion(null);
        tipoDestino.setUsuCreador("admin");
        tipoDestino.setUsuModificador("admin");
        tipoDestino.setEstado("A");
        tipoDestinoService.update(tipoDestino);
        System.out.println( "Destino:" + tipoDestino.getCodigo() + "-" + tipoDestino.getNombre() + " Actualizado");
    }

    @Test
    void debeRetornarTipoDestinoEliminado() throws Exception {
        TipoDestino tipoDestino = tipoDestinoService.findById(9).get();
        tipoDestinoService.delete(tipoDestino);
        System.out.println( "Destino:" + tipoDestino.getCodigo() + "-" + tipoDestino.getNombre() + " Eliminado");
    }

    /*
    @Test
    void debeRetornarTipoDestinoEliminadoPorId() throws Exception {
        tipoDestinoService.deleteById(2);
        System.out.println( "Destino con id 2 Eliminado");
    }
    */


    @Test
    void debeRetornarCantidadDeTiposDestino() {
        System.out.println("Cantidad de tipos de destino:" + tipoDestinoService.count());
    }

    @Test
    void debeRetornarListaTipoDestinoPorCodigo(){
        List<TipoDestino> lstTipoDestino = tipoDestinoService.findByCodigo("PLAYA");
        for (TipoDestino tipoDestino : lstTipoDestino) {
            System.out.println(tipoDestino.getCodigo() + "-" + tipoDestino.getNombre());
        }
    }

    @Test
    void debeRetornarListaTipoDestinoPorCodigoYEstado(){
        List<TipoDestino> lstTipoDestino = tipoDestinoService.findByCodigoAndEstado("PLAYA", "A");
        for (TipoDestino tipoDestino : lstTipoDestino) {
            System.out.println(tipoDestino.getCodigo() + "-" + tipoDestino.getNombre());
        }
    }

    @Test
    void debeRetornarListaTipoDestinoOrdenadosAlfabeticamente(){
        List<TipoDestino> lstTipoDestino = tipoDestinoService.findAllByOrderByNombreAsc();
        for (TipoDestino tipoDestino : lstTipoDestino) {
            System.out.println(tipoDestino.getCodigo() + "-" + tipoDestino.getNombre());
        }
    }

    @Test
    void debeRetornarListaTipoDestinoPorEstado(){
        List<TipoDestinoDTO> lstTipoDestino = tipoDestinoService.consultarTipoDestinoPorEstado("A");
        for (TipoDestinoDTO tipoDestino : lstTipoDestino) {
            System.out.println(tipoDestino.getCodigo() + "-" + tipoDestino.getNombre());
        }
    }

}