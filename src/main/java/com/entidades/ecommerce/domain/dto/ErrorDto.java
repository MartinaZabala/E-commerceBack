package com.entidades.ecommerce.domain.dto;


import lombok.*;


@Builder
public class ErrorDto {
    private String errorMsg;
    private String errorClass;
}
