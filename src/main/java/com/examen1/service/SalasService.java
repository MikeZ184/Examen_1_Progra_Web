/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.service;

import com.examen1.entity.Salas;
import com.examen1.repository.SalasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MIKE-PC
 */
@Service
public class SalasService implements ISalasService{
    
    @Autowired
    private SalasRepository salasRepository;

    @Override
    public List<Salas> listSalas() {
        return (List<Salas>)salasRepository.findAll();
    }
    
    
    
    
    
}
