package com.dreyer.projectcars.web.service;

import com.dreyer.projectcars.core.boundary.input.GetAllCarsInput;
import com.dreyer.projectcars.core.domain.entity.Car;
import com.dreyer.projectcars.web.dto.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class GetAllCarsService {
    private final GetAllCarsInput getAllCarInput;

    @Autowired
    public GetAllCarsService(GetAllCarsInput getAllCarInput) {
        this.getAllCarInput = getAllCarInput;
    }

    public List<CarDTO> execute() {
        final var carList = getAllCarInput.execute();

        return carList.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }

    private CarDTO convert(Car entity) {
        return CarDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .type(entity.getType())
                .description(entity.getDescription())
                .imageUrl(entity.getImageUrl())
                .videoUrl(entity.getVideoUrl())
                .latitude(entity.getLatitude())
                .longitude(entity.getLongitude())
                .build();
    }
}
