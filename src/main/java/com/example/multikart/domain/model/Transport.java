package com.example.multikart.domain.model;

import com.example.multikart.domain.dto.TransportRequestDTO;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transports", indexes = @Index(columnList = "status"))
public class Transport extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transport_id")
    private Long transportId;

    @NotBlank
    private String name;

    // Mô tả, ghi chú
    @Column(columnDefinition = "text")
    private String description;

    // Trạng thái
    @Column(name = "status", columnDefinition = "integer default 1", nullable = false)
    private Integer status;

    public Transport(TransportRequestDTO input) {
        name = input.getName();
        status = input.getStatus();
    }
}
