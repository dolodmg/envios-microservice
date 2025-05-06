package com.todocode.envios.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_envio;
    private Date fecha_creacion;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    private String descripcion;
    private Long id_destinatario;
}
