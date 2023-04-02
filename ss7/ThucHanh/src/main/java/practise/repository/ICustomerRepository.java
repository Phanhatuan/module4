package practise.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import practise.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long>{
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
