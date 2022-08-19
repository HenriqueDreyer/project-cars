package com.dreyer.projectcars.jpa.gatewayimpl;

import com.dreyer.projectcars.core.domain.entity.Car;
import com.dreyer.projectcars.core.domain.gateway.GetAllCarsGateway;
import com.dreyer.projectcars.jpa.entity.CarEntity;
import com.dreyer.projectcars.jpa.repository.CarEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class GetAllCarsGatewayImpl implements GetAllCarsGateway {
    private final CarEntityRepository carEntityRepository;

    @Autowired
    public GetAllCarsGatewayImpl(CarEntityRepository carEntityRepository) {
        this.carEntityRepository = carEntityRepository;
    }

    @Override
    public List<Car> findAll() {
        return carEntityRepository.findAll().stream()
                .map(this::buildFrom)
                .collect(Collectors.toUnmodifiableList());
    }

    private Car buildFrom(CarEntity entity) {
        return Car.builder()
                .id(entity.getId())
                .description(entity.getDescription())
                .latitude(entity.getLatitude())
                .longitude(entity.getLongitude())
                .name(entity.getName())
                .type(entity.getType())
                .imageUrl(entity.getImageUrl())
                .videoUrl(entity.getVideoUrl())
                .build();
    }
}
