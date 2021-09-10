package com.blitz.airbnb.apprentalstayapi.entities;

import lombok.Data;

@Data
public class Availability{
    private Integer availability_30;
    private Integer availability_60;
    private Integer availability_90;
    private Integer availability_365;
}