package com.cyberia.sigev.service.interfaces;

import com.cyberia.sigev.controller.dto.Condominium;

public interface CondominiumService {

    Condominium create(Condominium condominium);

    Condominium read(Long id);

    void update(Long id, Condominium condominium);

    void delete(Long id);



}
