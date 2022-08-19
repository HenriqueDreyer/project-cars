package com.dreyer.projectcars.core.usecase;

import com.dreyer.projectcars.core.boundary.input.GetAllCarsInput;
import com.dreyer.projectcars.core.domain.entity.Car;
import com.dreyer.projectcars.core.domain.gateway.GetAllCarsGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllCarsUseCase implements GetAllCarsInput {
    private final GetAllCarsGateway getAllCarsGateway;

    @Autowired
    public GetAllCarsUseCase(GetAllCarsGateway getAllCarsGateway) {
        this.getAllCarsGateway = getAllCarsGateway;
    }

    @Override
    public List<Car> execute() {
        return getAllCarsGateway.findAll();
    }
}
