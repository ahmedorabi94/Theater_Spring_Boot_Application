package com.ahmedorabi.theater.data

import com.ahmedorabi.theater.domain.Booking
import com.ahmedorabi.theater.domain.Performance
import com.ahmedorabi.theater.domain.Seat
import org.springframework.data.jpa.repository.JpaRepository

interface SeatRepository : JpaRepository<Seat, Long>

interface PerformanceRepository: JpaRepository<Performance, Long>

interface BookingRepository: JpaRepository<Booking, Long>