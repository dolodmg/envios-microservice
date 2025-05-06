package com.todocode.envios.service;

import com.todocode.envios.dto.EnvioDTO;
import com.todocode.envios.model.Envio;

import java.util.List;

public interface iEnvioService {
    //get envio by id
    public EnvioDTO getEnvio(Long id_envio);
    //get all envios
    public List<EnvioDTO> getAll();
    //post envio
    public String postEnvio(Envio envio);
    //delete envio
    public String deleteEnvio(Long id_envio);
    //edit envio
    public String editEnvio(Long id_envio, Envio envio);

}
