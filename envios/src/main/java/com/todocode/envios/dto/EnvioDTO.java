package com.todocode.envios.dto;

import com.todocode.envios.model.Estado;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnvioDTO {
    private Long id_envio;
    private Date fecha_creacion;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    private Long id_destinatario;

}
