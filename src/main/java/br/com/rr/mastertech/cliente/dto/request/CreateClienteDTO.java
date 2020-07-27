package br.com.rr.mastertech.cliente.dto.request;

import javax.validation.constraints.NotNull;

public class CreateClienteDTO {

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
