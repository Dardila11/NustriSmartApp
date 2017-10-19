/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author danielardila
 */
public class Controlador {
    
   

    public static ArrayList<Usuario> usuarioList = new ArrayList<>();
    
    public static Usuario registrarUsuario(String nombre, String email, String pass){
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPass(pass);
        usuario.setActivado(false);
        usuarioList.add(usuario);
        return usuario;
    
    }
    
    public static boolean activadoUsuario(String email){
        for(int i=0; i < usuarioList.size(); i++){
            if(usuarioList.get(i).getEmail().equals(email) && usuarioList.get(i).isActivado()){
                return true;
            }
            else
                return false;              
        }
        return false;
    }
   
}
