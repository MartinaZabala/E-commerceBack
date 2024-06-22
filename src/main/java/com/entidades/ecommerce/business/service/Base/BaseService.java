package com.entidades.ecommerce.business.service.Base;

import com.entidades.ecommerce.domain.entities.Base;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base, ID extends Serializable>{
    public E getById(ID id);
    public List<E> getAll();
}
