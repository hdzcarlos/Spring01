package com.chc.apirest.service;

import com.chc.apirest.entity.Usuario;

import java.util.List;

public interface IGestionUsuarios {
    /**
     * Ketodo que recupera una lista de nombres de usuarii
     * @return
     */

    List<String>listaNombre();

    /**
     * Metodo que crea un usuario de la base de datos
     * @param nombre
     * @return
     */

    boolean crearUsuarios(String nombre, String surname);

    /**
     * Metodo que actualiza un usuario de la base de datos
     * @param nombre
     * @return
     */

    boolean actualizarUsuario(Long id);

    /**
     *  Metodo que borra un usuario de la base de datos
     * @param nombre
     * @return
     */

    boolean eliminarUsuario(Long id);

}
