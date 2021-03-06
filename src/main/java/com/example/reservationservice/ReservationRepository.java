/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.reservationservice;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author NesmachnyyDN
 */
@RepositoryRestResource
public interface ReservationRepository extends JpaRepository <Reservation, Long>{
    @RestResource(path="by-name")
    Collection<Reservation> findByReservationName(@Param("reservationName") String resevationName);
    
}
