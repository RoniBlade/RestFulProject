package ru.module.shareit.booking;

import lombok.Data;
import ru.module.shareit.item.Item;
import ru.module.shareit.user.User;

import java.time.LocalDateTime;

/**
 * TODO Sprint add-bookings.
 */
@Data
public class Booking {
    private Long id;
    private LocalDateTime start;
    private LocalDateTime finish;
    private Item item;
    private User booker;
    private Status status;
}
