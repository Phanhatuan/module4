package practise.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import practise.entity.Customer;
import practise.entity.Province;

import java.util.Optional;

public interface ICustomerService extends IGeneralService<Customer>{
    Page<Customer> findAll(Pageable pageable);

}
