package co.edu.icesi.viajes.service;

import java.util.List;
import java.util.Optional;

import co.edu.icesi.viajes.dto.TipoDestinoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.repository.TipoDestinoRepository;

@Scope("singleton")
@Service
public class TipoDestinoServiceImpl implements TipoDestinoService{

    @Autowired
    private TipoDestinoRepository tipoDestinoRepository;

    @Override
    public List<TipoDestino> findAll() {
        List<TipoDestino> lstTipoDestino = tipoDestinoRepository.findAll();
        return lstTipoDestino;
    }

    @Override
    public Optional<TipoDestino> findById(Integer id) {
        return tipoDestinoRepository.findById(id);
    }

    @Override
    public TipoDestino save(TipoDestino entity) throws Exception {
        return tipoDestinoRepository.save(entity);
    }

    @Override
    public TipoDestino update(TipoDestino entity) throws Exception {
        return tipoDestinoRepository.save(entity);
    }

    @Override
    public void delete(TipoDestino entity) throws Exception {
        tipoDestinoRepository.delete(entity);

    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        tipoDestinoRepository.deleteById(integer);

    }

    @Override
    public void validate(TipoDestino entity) throws Exception {


    }

    @Override
    public long count() {
        return tipoDestinoRepository.count();
    }
    @Override
    public List<TipoDestino> findByCodigo(String codigo){
        return tipoDestinoRepository.findByCodigo(codigo);
    }

    @Override
    public List<TipoDestino> findByCodigoAndEstado(String codigo, String estado) {
        return tipoDestinoRepository.findByCodigoAndEstado(codigo, estado);
    }

    @Override
    public List<TipoDestino> findAllByOrderByNombreAsc() {
        return tipoDestinoRepository.findAllByOrderByNombreAsc();
    }

    @Override
    public List<TipoDestinoDTO> consultarTipoDestinoPorEstado(String estado) {
        return tipoDestinoRepository.consultarTipoDestinoPorEstado(estado);
    }

}
