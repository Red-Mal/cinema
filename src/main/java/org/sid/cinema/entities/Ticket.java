package org.sid.cinema.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomClient;
    private double prix;
    private int codePayment;
    private boolean reserve;
    @ManyToOne
    private Place place;
    @ManyToOne
    private Projection projection;


}
