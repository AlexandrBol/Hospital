package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Scheduler {
    private long scheduler_id;
    private Date date_start;
    private Date date_end;
    private long type_id;
}
