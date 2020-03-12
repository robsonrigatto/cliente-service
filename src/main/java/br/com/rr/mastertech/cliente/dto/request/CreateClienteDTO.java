package br.com.rr.mastertech.cliente.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateClienteDTO {

    @NotNull
    private String name;
}
