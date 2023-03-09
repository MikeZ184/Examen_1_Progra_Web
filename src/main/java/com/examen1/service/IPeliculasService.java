/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examen1.service;

import com.examen1.entity.Peliculas;
import java.util.List;

/**
 *
 * @author MIKE-PC
 */
public interface IPeliculasService {
    public List<Peliculas> getAllPeliculas();
    public void savePeliculas(Peliculas peliculas);
    public void delete (long id);
    
}
