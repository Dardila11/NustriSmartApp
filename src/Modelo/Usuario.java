/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author danielardila
 */
public class Usuario {
    public  static  int codigoContador = 1;
    private int id;
    private String nombre;
    private String email;
    private String pass;
    private String comuna;
    private String galeria;
    private String supermercado;
    private boolean activado;

    public Usuario() {
        this.id = codigoContador++;
    }

    public Usuario(int id, String nombre, String email, String pass, String comuna, String galeria, String supermercado, boolean activado) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.pass = pass;
        this.comuna = comuna;
        this.galeria = galeria;
        this.supermercado = supermercado;
        this.activado = activado;
    }

    public static int getCodigoContador() {
        return codigoContador;
    }

    public static void setCodigoContador(int codigoContador) {
        Usuario.codigoContador = codigoContador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getGaleria() {
        return galeria;
    }

    public void setGaleria(String galeria) {
        this.galeria = galeria;
    }

    public String getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(String supermercado) {
        this.supermercado = supermercado;
    }

    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }
    
    
}
