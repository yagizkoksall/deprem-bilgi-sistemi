package com.example.deprembilgisistemi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "eq")
public class eq {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String date;
    private String city;
    private String lat;
    private String lng;
    private String mag;
    private String derinlik;





}
