package co.edu.icesi.viajes.service;
import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class ClienteTest {
    @Autowired
    ClienteService clienteService;


    @Test
    void debeRetornarClientesPorEstadoyOrdenadosPorNumId(){
        Page<Cliente> lstCliente = clienteService.findByEstadoOrderByNumeroIdentificacionAsc("A", Pageable.unpaged());
        for (Cliente cliente : lstCliente){
            System.out.println(cliente.getNumeroIdentificacion() + "-" + cliente.getNombre());
        }
    }

    @Test
    void debeRetornarClientePorEmailIgnorandoMayusYMinus(){
        Cliente cliente = clienteService.findClienteByCorreoIgnoreCase("jUAn.PeREz@gmail.com");
        System.out.println(cliente.getNombre() + "-" + cliente.getCorreo());

    }

    @Test
    void debeRetornarClientePorNumeroIdentificacion(){
        Cliente cliente = clienteService.findClienteByNumeroIdentificacionLike("23456789");
        System.out.println(cliente.getNombre() + "-" + cliente.getPrimerApellido() + "-" + cliente.getSegundoApellido());
    }

    @Test
    void debeRetornarClientePorNombreIgnorandoMayusYMinus(){
        Cliente cliente = clienteService.findClienteByNombreLikeIgnoreCase("JuAn");
        System.out.println(cliente.getNombre() + "-" + cliente.getPrimerApellido() + "-" + cliente.getSegundoApellido());
    }

    @Test
    void debeRetornarClientesPorRangoDeFechasDeNacimiento() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha1 = formato.parse("15/11/1988");
        Date fecha2 = formato.parse("16/01/1990");

        List<Cliente> lstCliente = clienteService.findClientesByFechaNacimientoBetween(fecha1,fecha2);
        for (Cliente cliente : lstCliente){
            System.out.println(cliente.getNombre() + "-" + cliente.getPrimerApellido() + "-" + cliente.getSegundoApellido());
        }

    }

    @Test
    void debeRetornarTotalClientesPorEstado(){
        int clienteByEstado = clienteService.countByEstado("A");
        System.out.println("Total Clientes por estado " + clienteByEstado);
    }


    @Test
    void debeRetornarListaClientesPorPrimerYSegundoApellido(){
        List<Cliente> lstClientes = clienteService.findClientesByPrimerApellidoAndSegundoApellido("Morales","Fernandez");
        for(Cliente cliente : lstClientes){
            System.out.println(cliente.getNombre() + "-" + cliente.getPrimerApellido() + "-" + cliente.getSegundoApellido());
        }
    }

    @Test
    void debeRetornarClientesPorDistintosFiltrosOpcionales(){
        List<ClienteDTO> lstClientes = clienteService.consultarClientesPorNombre("A","","TI", "");
        for(ClienteDTO client : lstClientes){
            System.out.println(client.getNombre() + "-" + client.getPrimerApellido() + "-" + client.getSegundoApellido());
        }
    }

    @Test
    void debeRetornarPlanPorIdCliente(){
        List<ClienteDTO> lstClientes = clienteService.consultarPlanPorCliente("23456789");
        for(ClienteDTO client : lstClientes){
            System.out.println(client.getNumeroIdentificacion() + " - " + client.getNombre() + " - " + client.getPrimerApellido() + " - " + client.getSegundoApellido() + " - " + client.getDescripcionSolicitud() + " - " + client.getCantidadPersonas() + " - " + client.getAlimentacion() + " - " + client.getHospedaje() + " - " + client.getTransporte() + " - " + client.getTraslados() + " - " + client.getValor() + " - " +client.getCantidadNoches() + " - " +client.getCantidadDias());
        }
    }


}
