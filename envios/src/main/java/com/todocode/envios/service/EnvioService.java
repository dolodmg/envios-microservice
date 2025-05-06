package com.todocode.envios.service;

import com.todocode.envios.dto.EnvioDTO;
import com.todocode.envios.mapper.EnvioMapper;
import com.todocode.envios.model.Envio;
import com.todocode.envios.repository.EnvioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnvioService implements iEnvioService {
    private final EnvioRepository envioRepository;

    public EnvioService(EnvioRepository envioRepository) {
        this.envioRepository = envioRepository;
    }

    @Override
    public EnvioDTO getEnvio(Long id_envio) {
        Envio envio = envioRepository.findById(id_envio).orElseThrow(() -> new RuntimeException("Envio no encontrado."));
        return EnvioMapper.toDto(envio);
    }

    @Override
    public List<EnvioDTO> getAll() {
        return envioRepository.findAll()
                .stream()
                .map(EnvioMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public String postEnvio(Envio envio) {
        try {
            envioRepository.save(envio);
            return "Envío creado correctamente";
        } catch (Exception e) {
            return "No se pudo crear el envío " + e.getMessage();
        }
    }

    @Override
    public String deleteEnvio(Long id_envio) {
        try {
            envioRepository.deleteById(id_envio);
            return "El envío fue eliminado correctamente.";
        } catch (Exception e) {
            return "No se pudo eliminar el envío" + e.getMessage();
        }
    }

    @Override
    public String editEnvio(Long id_envio, Envio envio) {
        try {
            this.postEnvio(envio);
            return "El envío fue editado correctamente.";
        } catch (Exception e) {
            return "No se pudo editar el envío" + e.getMessage();
        }
    }

}
