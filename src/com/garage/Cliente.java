package com.garage;

import java.util.Objects;

public class Cliente extends Persona{
    private Long idCliente;
    private Boolean tipoCliente;

    public Cliente(String dni, String nombre, String apellidos, String telefono, String email, Long idCliente, Boolean tipoCliente) {
        super(dni, nombre, apellidos, telefono, email);
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Boolean getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Boolean tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return idCliente.equals(cliente.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idCliente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", tipoCliente=" + tipoCliente +
                '}';
    }
}
