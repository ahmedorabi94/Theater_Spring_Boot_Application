package com.ahmedorabi.theater.services

import com.ahmedorabi.theater.domain.Seat
import org.springframework.stereotype.Service

@Service
class BookingService() {

    fun isSeatFree(seat : Seat) : Boolean {
        return true
    }

}