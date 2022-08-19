package com.dreyer.projectcars.core.domain.gateway;

import com.dreyer.projectcars.core.domain.entity.Car;

import java.util.List;

public interface GetAllCarsGateway {
    List<Car> findAll();
}
