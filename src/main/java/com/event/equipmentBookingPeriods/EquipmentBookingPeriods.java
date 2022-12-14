package com.event.equipmentBookingPeriods;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentBookingPeriods {
    private Integer id;
    private LocalDateTime bookingStart;
    private LocalDateTime bookingEnd;
}
