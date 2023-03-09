/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.controller;

import com.examen1.entity.Peliculas;
import com.examen1.service.IPeliculasService;
import com.examen1.service.ISalasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



/**
 *
 * @author MIKE-PC
 */
@Controller
public class PeliculasController {
    @Autowired
    private IPeliculasService peliculasService;
    
    @Autowired
    private ISalasService salasService;
    
    @GetMapping("/peliculas")//endpoint
    public String index(Model model){
        List<Peliculas> listaPeliculas = peliculasService.getAllPeliculas();
        model.addAttribute("titulo","Tabla Peliculas");
        model.addAttribute("peliculas",listaPeliculas);
        return "peliculas"; //nombre del html
    }
    
}
