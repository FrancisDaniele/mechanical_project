package com.garage;

import java.util.Objects;

public class Vehiculo {
    private String matricula;
    private String modelo;
    private String anomatricula;
    private String trabajador;

    public Vehiculo(String matricula, String modelo, String anomatricula, String trabajador) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.anomatricula = anomatricula;
        this.trabajador = trabajador;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnomatricula() {
        return anomatricula;
    }

    public void setAnomatricula(String anomatricula) {
        this.anomatricula = anomatricula;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula) &&
                Objects.equals(modelo, vehiculo.modelo) &&
                Objects.equals(anomatricula, vehiculo.anomatricula) &&
                Objects.equals(trabajador, vehiculo.trabajador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, modelo, anomatricula, trabajador);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anomatricula='" + anomatricula + '\'' +
                ", trabajador='" + trabajador + '\'' +
                '}';
    }
}
