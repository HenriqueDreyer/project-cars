package com.dreyer.projectcars.core.domain.entity;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class Car {
    private Long id;
    private String description;
    private String latitude;
    private String longitude;
    private String name;
    private String type;
    private String imageUrl;
    private String videoUrl;
}
