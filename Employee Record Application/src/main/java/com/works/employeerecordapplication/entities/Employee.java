package com.works.employeerecordapplication.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Data
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String name;
  private String surname;

  @Column(unique = true)
  @Email(message = "E-mail format is required")
  private String email;

  @NotBlank(message = "Department can not be empty")
  private String department;

  private Integer income;

  @CreationTimestamp
  private Date startedDate;

  @ManyToOne
  private Location location;
}