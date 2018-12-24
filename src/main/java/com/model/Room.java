package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Room {
    private long room_id;
    private long number;
    private String name;
    private String placed;
    private long hospital_id;
    private long work_places;
}
