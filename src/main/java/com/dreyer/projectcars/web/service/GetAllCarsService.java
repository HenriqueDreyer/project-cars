package com.dreyer.projectcars.web.service;

import com.dreyer.projectcars.jpa.entity.CarEntity;
import com.dreyer.projectcars.jpa.repository.CarEntityRepository;
import com.dreyer.projectcars.web.dto.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class GetAllCarsService {
    private final CarEntityRepository carEntityRepository;

    @Autowired
    public GetAllCarsService(CarEntityRepository carEntityRepository) {
        this.carEntityRepository = carEntityRepository;
    }

    public List<CarDTO> execute() {
        final var carList = carEntityRepository.findAll();

        return carList.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }

    private CarDTO convert(CarEntity entity) {
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
