/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examen1.repository;

import com.examen1.entity.Salas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MIKE-PC
 */
@Repository
public interface SalasRepository extends CrudRepository<Salas,Long>{
    
}
