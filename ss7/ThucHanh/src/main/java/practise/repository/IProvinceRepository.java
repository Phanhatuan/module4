package practise.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import practise.entity.Province;

@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}