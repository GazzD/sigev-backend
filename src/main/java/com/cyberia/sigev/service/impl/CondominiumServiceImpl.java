package com.cyberia.sigev.service.impl;

import com.cyberia.sigev.controller.dto.Condominium;
import com.cyberia.sigev.model.CondominiumEntity;
import com.cyberia.sigev.repository.CondominiumRepository;
import com.cyberia.sigev.service.interfaces.CondominiumService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CondominiumServiceImpl implements CondominiumService {

    private final CondominiumRepository condominiumRepository;

    public CondominiumServiceImpl(CondominiumRepository condominiumRepository) {
        this.condominiumRepository = condominiumRepository;
    }

    @Override
    public Condominium create(Condominium condominium) {
        return new Condominium(condominiumRepository.save(condominium.toEntity()));
    }

    @Override
    public Condominium read(Long id) {

        return new Condominium(condominiumRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Condominium not found")));
    }

    @Override
    public void update(Long id, Condominium condominium) {
        CondominiumEntity condominiumEntity = condominiumRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Condominium not found"));
        condominiumEntity.setName(condominium.getName());
        condominiumEntity.setAddress(condominium.getAddress());
        condominiumEntity.setCity(condominium.getCity());
        condominiumEntity.setState(condominium.getState());
        condominiumEntity.setZipCode(condominium.getZipCode());
        condominiumEntity.setCountry(condominium.getCountry());
        condominiumRepository.save(condominiumEntity);

    }

    @Override
    public void delete(Long id) {
        condominiumRepository.deleteById(id);
    }
}
