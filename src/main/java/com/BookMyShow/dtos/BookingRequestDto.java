package com.BookMyShow.dtos;

import java.util.List;

public class BookingRequestDto {
    public Long showId;
    public List<Long> showSeatIds;
    public Long userId;
}
