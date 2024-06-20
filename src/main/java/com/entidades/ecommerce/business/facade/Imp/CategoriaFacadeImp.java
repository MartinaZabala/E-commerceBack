package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.Base.BaseFacadeImp;
import com.entidades.ecommerce.business.facade.CategoriaFacade;
import com.entidades.ecommerce.business.mapper.BaseMapper;
import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.business.service.CategoriaService;
import com.entidades.ecommerce.domain.dto.categoria.CategoriaCreateDto;
import com.entidades.ecommerce.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaFacadeImp extends BaseFacadeImp<Categoria, CategoriaCreateDto, Long> implements CategoriaFacade {
    @Autowired

    private CategoriaService categoriaService;
    public CategoriaFacadeImp(BaseService<Categoria, Long> baseService, BaseMapper<Categoria, CategoriaCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
    public List<CategoriaCreateDto> categoriaSucursal(Long idSucursal) {
        return this.categoriaService.categoriaSucursal(idSucursal);
    }
}
