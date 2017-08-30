/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.reservationservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author NesmachnyyDN
 */
@Entity
public class Reservation {
    @Id @GeneratedValue
    private Long Id;
    private String reservationName;

    public Long getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Reservation{" + "Id=" + Id + ", reservationName=" + reservationName + '}';
    }

    public String getReservationName() {
        return reservationName;
    }

    public Reservation(String reservationName) {
        this.reservationName = reservationName;
    }

    public Reservation() {
    }
    
    
}
