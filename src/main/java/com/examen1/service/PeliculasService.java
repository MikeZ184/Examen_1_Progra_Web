/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.service;

import com.examen1.entity.Peliculas;
import com.examen1.repository.PeliculasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MIKE-PC
 */
@Service
public class PeliculasService implements IPeliculasService{
    @Autowired
    private PeliculasRepository peliculasRepository;
    
    @Override
    public List<Peliculas> getAllPeliculas() {
        return (List<Peliculas>)peliculasRepository.findAll();
    }


    @Override
    public void savePeliculas(Peliculas peliculas) {
        peliculasRepository.save(peliculas);
    }

    @Override
    public void delete(long id) {
        peliculasRepository.deleteById(id);
    }
    
}
