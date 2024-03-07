package co.edu.icesi.viajes.dto;

import lombok.Builder;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
@Data
public class TipoDestinoDTO implements Serializable {
    public TipoDestinoDTO(Integer idTide, String codigo, String nombre) {
        this.idTide = idTide;
        this.codigo = codigo;
        this.nombre = nombre;
    }


    @Serial
    private static final long serialVersionUID = 6334646226855431916L;

    private Integer idTide;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuCreador;
    private String usuModificador;
    private String estado;


}



