package com.entidades.ecommerce.business.mapper;

import com.entidades.ecommerce.domain.dto.BaseDto;
import com.entidades.ecommerce.domain.entities.Base;

import java.util.List;

public interface BaseMapper<E extends Base,D extends BaseDto>{
    public D toDTO(E source);
    public E toEntity(D source);
    public List<D> toDTOsList(List<E> source);
}
