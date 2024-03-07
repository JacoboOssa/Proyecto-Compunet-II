package co.edu.icesi.viajes.domain;
import co.edu.icesi.viajes.dto.TipoDestinoDTO;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "TipoDestino.consultarTipoDestinoPorEstado",
                query = "",
                resultSetMapping = "TipoDestino.consultarTipoDestinoPorEstado"
        )
})

@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "TipoDestino.consultarTipoDestinoPorEstado",
                classes = { @ConstructorResult(targetClass = TipoDestinoDTO.class,
                        columns = {
                                @ColumnResult(name = "id_tide", type = Integer.class),
                                @ColumnResult(name = "codigo", type = String.class),
                                @ColumnResult(name = "nombre", type = String.class),
                        })

                }
        )
})
@Data
@Entity
@Table(name="tipo_destino")
public class TipoDestino {
    @Id
    @Column(name = "id_tide")
    private Integer idTide;
    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "usu_creador")
    private String usuCreador;

    @Column(name = "usu_modificador")
    private String usuModificador;

    @Column(name = "estado")
    private String estado;
}
