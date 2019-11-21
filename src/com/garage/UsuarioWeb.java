package com.garage;

import java.util.Objects;

public class UsuarioWeb extends Cliente {
    private String username;
    private String password;

    public UsuarioWeb(String dni, String nombre, String apellidos, String telefono, String email, Long idCliente, Boolean tipoCliente, String username, String password) {
        super(dni, nombre, apellidos, telefono, email, idCliente, tipoCliente);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UsuarioWeb that = (UsuarioWeb) o;
        return username.equals(that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), username);
    }

    @Override
    public String toString() {
        return "UsuarioWeb{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
