package co.edu.icesi.viajes.service;
import java.util.List;
import java.util.Optional;

import co.edu.icesi.viajes.dto.DestinoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.repository.DestinoRepository;

@Service
@Scope("singleton")
public class DestinoServiceImpl implements DestinoService{
    @Autowired
    private DestinoRepository destinoRepository;
    @Override
    public List<Destino> findAll() {
        return null;
    }

    @Override
    public Optional<Destino> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public Destino save(Destino entity) throws Exception {
        return null;
    }

    @Override
    public Destino update(Destino entity) throws Exception {
        return null;
    }

    @Override
    public void delete(Destino entity) throws Exception {

    }

    @Override
    public void deleteById(Integer integer) throws Exception {

    }

    @Override
    public void validate(Destino entity) throws Exception {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Destino findDestinoByCodigoAndEstado(String codigo, String estado) {
        return destinoRepository.findDestinoByCodigoAndEstado(codigo, estado);
    }

    @Override
    public List<Destino> findDestinoByEstado() {
        return destinoRepository.findDestinoByEstado();
    }

    @Override
    public List<DestinoDTO> consultaDestinosPorTipoDest(String nombre) {
        return destinoRepository.consultaDestinosPorTipoDest(nombre);
    }


}
