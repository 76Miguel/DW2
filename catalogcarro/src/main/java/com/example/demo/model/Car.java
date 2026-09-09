
package com.example.demo.model;



import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.Table;



@Entity

@Table(name = "carros")

public class Car {

   



    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;



    @Column(name = "marca", nullable = false)

    private String marca;



    @Column(name = "modelo", nullable = false)

    private String modelo;



    @Column(name = "ano")

    private int ano;



    public Long getId() {

        return id;

    }



    public void setId(Long id) {

        this.id = id;

    }



    public String getMarca() {

        return marca;

    }



    public void setMarca(String marca) {

        this.marca = marca;

    }



    public String getModelo() {

        return modelo;

    }



    public void setModelo(String modelo) {

        this.modelo = modelo;

    }



    public int getAno() {

        return ano;

    }



    public void setAno(int ano) {

        this.ano = ano;

    }

} 

