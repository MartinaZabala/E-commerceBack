package com.entidades.ecommerce.business.service;

import com.entidades.ecommerce.business.service.Base.BaseService;
import com.entidades.ecommerce.domain.dto.sucursal.SucursalFullDto;
import com.entidades.ecommerce.domain.entities.Sucursal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface SucursalService  extends BaseService<Sucursal, Long> {
    List<SucursalFullDto> sucursalEmpresa(Long idEmpresa);

    Sucursal guardarSucursal(Sucursal sucursal);
    Sucursal actualizarSucursal(Long id,Sucursal sucursal);

    //Imagenes
    // Método para obtener todas las imágenes almacenadas
    ResponseEntity<List<Map<String, Object>>> getAllImagesBySucursalId(Long id);
    // Método para subir imágenes al sistema
    ResponseEntity<String> uploadImages(MultipartFile[] files, Long id);
    // Método para eliminar una imagen por su identificador público y Long
    ResponseEntity<String> deleteImage(String publicId, Long id);
}

