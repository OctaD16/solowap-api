package com.solowap.api.repository;

import com.solowap.api.model.OrdersDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrdersDetailRepository extends JpaRepository<OrdersDetail, Long> {
}
