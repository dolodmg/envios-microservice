package com.todocode.envios.mapper;

import com.todocode.envios.dto.EnvioDTO;
import com.todocode.envios.model.Envio;

public class EnvioMapper {
    public static EnvioDTO toDto(Envio envio) {
        EnvioDTO dto = new EnvioDTO();
        dto.setId_envio(envio.getId_envio());
        dto.setFecha_creacion(envio.getFecha_creacion());
        dto.setEstado(envio.getEstado());
        dto.setId_destinatario(envio.getId_destinatario());
        return dto;
    }
}
