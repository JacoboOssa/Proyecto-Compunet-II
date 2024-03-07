package co.edu.icesi.viajes.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.repository.UsuarioRepository;
@Service
@Scope("singleton")
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> findAll() {
        List<Usuario> lstUsuario = usuarioRepository.findAll();
        return lstUsuario;
    }

    @Override
    public Optional<Usuario> findById(Integer integer) {
        return usuarioRepository.findById(integer);
    }

    @Override
    public Usuario save(Usuario entity) throws Exception {
        return usuarioRepository.save(entity);
    }

    @Override
    public Usuario update(Usuario entity) throws Exception {
        return usuarioRepository.save(entity);
    }

    @Override
    public void delete(Usuario entity) throws Exception {
        usuarioRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        usuarioRepository.deleteById(integer);
    }

    @Override
    public void validate(Usuario entity) throws Exception {

    }

    @Override
    public long count() {
        return usuarioRepository.count();
    }
}
