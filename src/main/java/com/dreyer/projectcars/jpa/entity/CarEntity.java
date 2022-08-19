package com.dreyer.projectcars.jpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Table(name = "CARRO", schema = "PROJECT_CAR")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String description;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "tipo", nullable = false)
    private String type;

    @Column(name = "url_foto")
    private String imageUrl;

    @Column(name = "url_video")
    private String videoUrl;
}
