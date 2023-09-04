package ss3.th.service.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ss3.th.model.Customer;
import ss3.th.service.IGenericService;


public interface ICustomerService extends IGenericService<Customer, Long> {
    //    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

}
