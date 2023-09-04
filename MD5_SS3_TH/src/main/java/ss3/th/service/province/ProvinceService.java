package ss3.th.service.province;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ss3.th.model.Province;
import ss3.th.repository.IProvinceRepository;

import java.util.Optional;

@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void delete(Long id) {
        provinceRepository.deleteById(id);

    }

}
