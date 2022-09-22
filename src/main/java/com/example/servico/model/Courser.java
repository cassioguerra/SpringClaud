package com.example.servico.model;

import lombok.*;
import org.aspectj.bridge.Message;

import javax.persistence.*;


@Entity
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Courser  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
   //@Column(nullable = false)
    private String title;
}
