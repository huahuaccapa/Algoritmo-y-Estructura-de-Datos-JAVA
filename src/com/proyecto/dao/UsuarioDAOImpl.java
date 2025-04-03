package com.proyecto.dao;

import com.proyecto.modelo.Usuario;

public class UsuarioDAOImpl {

    public boolean validarUsuario(Usuario usuario) {
        if (usuario.getNombreUsuario().equals("admin") && usuario.getContrasena().equals("admin123")) {
            return true;
        } else return usuario.getNombreUsuario().equals("user2") && usuario.getContrasena().equals("user2123");
    }

    public Usuario buscarUsuario(String nombreUsuario) {
        
        return switch (nombreUsuario) {
            case "admin" -> new Usuario("admin", "admin123");
            case "user2" -> new Usuario("user2", "user2123");
            default -> null;
        };
    }
}
