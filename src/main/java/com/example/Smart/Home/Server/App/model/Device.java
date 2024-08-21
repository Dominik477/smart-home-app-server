package com.example.Smart.Home.Server.App.model;

import com.example.Smart.Home.Server.App.enumeration.Room;
import com.example.Smart.Home.Server.App.enumeration.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    @NotEmpty(message = "Device needs a name")
    private String name;

    private String type;
    private String imageUrl;
    private Room room;
    private Status status;
}
