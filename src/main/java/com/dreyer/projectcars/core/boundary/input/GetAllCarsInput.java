package com.dreyer.projectcars.core.boundary.input;

import com.dreyer.projectcars.core.domain.entity.Car;

import java.util.List;

public interface GetAllCarsInput {
    List<Car> execute();
}
