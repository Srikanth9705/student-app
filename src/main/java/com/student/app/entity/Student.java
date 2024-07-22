package com.student.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STUDENT_TAB")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studId;
    private String studName;
    private String studAddress;
    private String course;

}
