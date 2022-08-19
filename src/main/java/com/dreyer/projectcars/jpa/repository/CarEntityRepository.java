package com.dreyer.projectcars.jpa.repository;

import com.dreyer.projectcars.jpa.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarEntityRepository extends JpaRepository<CarEntity, Long> {
}
