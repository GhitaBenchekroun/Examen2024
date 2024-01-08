package com.example.courses.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Course {

    private Long id ;
    private String nom ;
    private String prenom ;


}
