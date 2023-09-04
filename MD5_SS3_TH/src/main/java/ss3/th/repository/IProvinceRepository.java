package ss3.th.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ss3.th.model.Province;

@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province, Long> {

}

