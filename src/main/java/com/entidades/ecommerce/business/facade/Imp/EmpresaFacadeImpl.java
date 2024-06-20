package com.entidades.ecommerce.business.facade.Imp;

import com.entidades.ecommerce.business.facade.Base.BaseFacadeImp;
import com.entidades.ecommerce.business.facade.EmpresaFacade;
import com.entidades.ecommerce.business.mapper.BaseMapper;
import com.entidades.ecommerce.business.mapper.EmpresaMapper;
import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.business.service.EmpresaService;
import com.entidades.ecommerce.domain.dto.empresa.EmpresaCreateDto;
import com.entidades.ecommerce.domain.dto.empresa.EmpresaFullDto;
import com.entidades.ecommerce.domain.entities.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class EmpresaFacadeImpl extends BaseFacadeImp<Empresa, EmpresaCreateDto,Long> implements EmpresaFacade {

    public EmpresaFacadeImpl(BaseService<Empresa, Long> baseService, BaseMapper<Empresa, EmpresaCreateDto>baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    EmpresaMapper empresaMapper;


    @Autowired
    EmpresaService empresaService;
    @Override
    public EmpresaFullDto addSucursal(Long idEmpresa, Long idSucursal) {
        return empresaMapper.toLargeDto(empresaService.addSucursal(idEmpresa, idSucursal));
    }

    @Override
    public ResponseEntity<List<Map<String, Object>>> getAllImagesByEmpresaId(Long id) {
        return empresaService.getAllImagesByEmpresaId(id);
    }

    @Override
    public ResponseEntity<String> uploadImages(MultipartFile[] files, Long id) {
        return empresaService.uploadImages(files,id);
    }

    @Override
    public ResponseEntity<String> deleteImage(String publicId, Long id) {
        return empresaService.deleteImage(publicId, id);
    }
}
