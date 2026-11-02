package com.solowap.api.serviceJPA;

import com.solowap.api.model.OrdersDetail;
import java.util.List;

public interface IOrdersDetailService {
    OrdersDetail guardar(OrdersDetail ordersDetail);
    OrdersDetail buscarPorId(Long id);
    List<OrdersDetail> buscarTodos();
    void eliminar(Long id);
    OrdersDetail actualizar(Long id, OrdersDetail ordersDetail);
}
