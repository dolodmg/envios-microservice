package com.todocode.envios.controller;

import com.todocode.envios.dto.EnvioDTO;
import com.todocode.envios.model.Envio;
import com.todocode.envios.service.EnvioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/envios")
public class EnvioController {

    private final EnvioService envioService;

    public EnvioController(EnvioService envioService) {
        this.envioService = envioService;
    }

    //GET envio by id
    @GetMapping("/{id_envio}")
    public EnvioDTO getEnvio(@PathVariable Long id_envio) {
        return envioService.getEnvio(id_envio);
    }

    //GET all envios
    @GetMapping("/all")
    public List<EnvioDTO> getEnvios() {
        return envioService.getAll();
    }

    //POST envio
    @PostMapping("/post")
    public String postEnvio(@RequestBody Envio envio) {
        return envioService.postEnvio(envio);
    }

    //DELETE envio
    @DeleteMapping("/delete/{id_envio}")
    public String deleteEnvio(@PathVariable Long id_envio) {
        return envioService.deleteEnvio(id_envio);
    }

    //EDIT envio
    @PutMapping("/edit/{id_envio}")
    public String editEnvio(@PathVariable Long id_envio, @RequestBody Envio envio) {
        return envioService.editEnvio(id_envio, envio);
    }
}
