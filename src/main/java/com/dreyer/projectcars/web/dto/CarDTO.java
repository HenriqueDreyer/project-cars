package com.dreyer.projectcars.web.dto;

import lombok.*;

import javax.persistence.Column;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class CarDTO {
    private Long id;
    private String description;
    private String latitude;
    private String longitude;
    private String name;
    private String type;
    private String imageUrl;
    private String videoUrl;
}
