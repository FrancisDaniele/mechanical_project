package com.garage;

import java.util.Objects;

public class Trabajador extends Persona {
    private Long idTrabajador;
    private Double precioHora;
    private Categoria categoria;

    public Trabajador(String dni, String nombre, String apellidos, String telefono, String email, Long idTrabajador, Double precioHora, Categoria categoria) {
        super(dni, nombre, apellidos, telefono, email);
        this.idTrabajador = idTrabajador;
        this.precioHora = precioHora;
        this.categoria = categoria;
    }

    public Long getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Long idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public Double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(Double precioHora) {
        this.precioHora = precioHora;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trabajador that = (Trabajador) o;
        return idTrabajador.equals(that.idTrabajador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idTrabajador);
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "idTrabajador=" + idTrabajador +
                ", precioHora=" + precioHora +
                ", categoria=" + categoria +
                '}';
    }
}
