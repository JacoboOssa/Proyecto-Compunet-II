package co.edu.icesi.viajes.dto;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
public class ClienteDTO implements Serializable {

    public ClienteDTO(String numeroIdentificacion,String primerApellido, String segundoApellido,String nombre,String estado,String codigo) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.estado = estado;
        this.codigo = codigo;
    }

    public ClienteDTO(String numeroIdentificacion, String primerApellido, String segundoApellido, String nombre, String nombreTipoId) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.nombreTipoId = nombreTipoId;
    }

    public ClienteDTO (String numeroIdentificacion,String primerApellido,String segundoApellido,String nombre, String descripcionSolicitud,Integer cantidadPersonas, String alimentacion, String hospedaje, String transporte, String traslados, Double valor, Integer cantidadNoches, Integer cantidadDias){
        this.numeroIdentificacion = numeroIdentificacion;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.descripcionSolicitud = descripcionSolicitud;
        this.cantidadPersonas = cantidadPersonas;
        this.alimentacion = alimentacion;
        this.hospedaje = hospedaje;
        this.transporte = transporte;
        this.traslados = traslados;
        this.valor = valor;
        this.cantidadNoches = cantidadNoches;
        this.cantidadDias = cantidadDias;
    }

    @Serial
    private static final long serialVersionUID = 8460626525156785057L;

    private Integer idClie;
    private String numeroIdentificacion;
    private String primerApellido;
    private String segundoApellido;
    private String nombre;
    private String telefono1;
    private String telefono2;
    private String correo;
    private String sexo;
    private Date fechaNacimiento;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuCreador;
    private String usuModificador;
    private String estado;
    private Integer idTiid;
    private String nombreTipoId;
    private String codigo;

    private String descripcionSolicitud;
    private Integer cantidadPersonas;
    private String alimentacion;
    private String hospedaje;
    private String transporte;
    private String traslados;
    private Double valor;
    private Integer cantidadNoches;
    private Integer cantidadDias;
}
