package com.entidades.ecommerce.business.facade.Base;

import com.entidades.ecommerce.domain.dto.BaseDto;

import java.io.Serializable;
import java.util.List;

public interface BaseFacade <D extends BaseDto, ID extends Serializable>{
    public D getById(Long id);
    public List<D> getAll();
}
