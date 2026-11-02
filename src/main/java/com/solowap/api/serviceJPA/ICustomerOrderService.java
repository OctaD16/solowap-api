package com.solowap.api.serviceJPA;

import com.solowap.api.model.CustomerOrder;
import java.util.List;

public interface ICustomerOrderService {
    CustomerOrder guardar(CustomerOrder customerOrder);
    CustomerOrder buscarPorId(Long id);
    List<CustomerOrder> buscarTodos();
    void eliminar(Long id);
    CustomerOrder actualizar(Long id, CustomerOrder customerOrder);
    boolean existe(Long id);
}
