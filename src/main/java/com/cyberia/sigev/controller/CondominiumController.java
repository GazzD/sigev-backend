package com.cyberia.sigev.controller;

import com.cyberia.sigev.controller.dto.Condominium;
import com.cyberia.sigev.service.impl.CondominiumServiceImpl;
import com.cyberia.sigev.service.interfaces.CondominiumService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CondominiumController {

    private final CondominiumService condominiumService;

    public CondominiumController(CondominiumServiceImpl condominiumService) {
        this.condominiumService = condominiumService;
    }

    @PostMapping("/condominium")
    public Condominium create(@RequestBody Condominium condominium) {
        return condominiumService.create(condominium);
    }

    @GetMapping("/condominium/{id}")
    public Condominium read(@PathVariable Long id) {
        return condominiumService.read(id);
    }

    @PutMapping("/condominium/{id}")
    public void update(@PathVariable Long id, @RequestBody Condominium condominium) {
        condominiumService.update(id, condominium);
    }

    @DeleteMapping("/condominium/{id}")
    public void delete(@PathVariable Long id) {
        condominiumService.delete(id);
    }


}
