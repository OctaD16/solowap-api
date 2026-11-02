package com.solowap.api.repository;

import com.solowap.api.model.StoreConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStoreConfigRepository extends JpaRepository<StoreConfig, Long> {
}
