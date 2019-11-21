package com.garage;

import java.util.Objects;

public class Averia {
    private Long idAveria;
    private String nomCorto;
    private String descripcion;
    private Double precio;
    private TipoAveria tipoAveria;
    private String vehiculo;
    private Long idTrabajador;

    public Averia(Long idAveria, String nomCorto, String descripcion, Double precio, TipoAveria tipoAveria, String vehiculo, Long idTrabajador) {
        this.idAveria = idAveria;
        this.nomCorto = nomCorto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipoAveria = tipoAveria;
        this.vehiculo = vehiculo;
        this.idTrabajador = idTrabajador;
    }

    public Long getIdAveria() {
        return idAveria;
    }

    public void setIdAveria(Long idAveria) {
        this.idAveria = idAveria;
    }

    public String getNomCorto() {
        return nomCorto;
    }

    public void setNomCorto(String nomCorto) {
        this.nomCorto = nomCorto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public TipoAveria getTipoAveria() {
        return tipoAveria;
    }

    public void setTipoAveria(TipoAveria tipoAveria) {
        this.tipoAveria = tipoAveria;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Long getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Long idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Averia averia = (Averia) o;
        return idAveria.equals(averia.idAveria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAveria);
    }

    @Override
    public String toString() {
        return "Averia{" +
                "idAveria=" + idAveria +
                ", nomCorto='" + nomCorto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", tipoAveria=" + tipoAveria +
                ", vehiculo='" + vehiculo + '\'' +
                ", idTrabajador=" + idTrabajador +
                '}';
    }
}
