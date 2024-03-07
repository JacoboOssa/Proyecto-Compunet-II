package co.edu.icesi.viajes.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import co.edu.icesi.viajes.domain.DetallePlan;
import co.edu.icesi.viajes.repository.DetallePlanRepository;
@Service
@Scope("singleton")
public class DetallePlanServiceImpl implements DetallePlanService{
    @Autowired
    private DetallePlanRepository detallePlanRepository;

    @Override
    public List<DetallePlan> findAll() {
        List<DetallePlan> lstDetallePlan = detallePlanRepository.findAll();
        return lstDetallePlan;
    }

    @Override
    public Optional<DetallePlan> findById(Integer integer) {
        return detallePlanRepository.findById(integer);
    }

    @Override
    public DetallePlan save(DetallePlan entity) throws Exception {
        return detallePlanRepository.save(entity);
    }

    @Override
    public DetallePlan update(DetallePlan entity) throws Exception {
        return detallePlanRepository.save(entity);
    }

    @Override
    public void delete(DetallePlan entity) throws Exception {
        detallePlanRepository.delete(entity);

    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        detallePlanRepository.deleteById(integer);

    }

    @Override
    public void validate(DetallePlan entity) throws Exception {


    }

    @Override
    public long count() {
        return detallePlanRepository.count();
    }
}
