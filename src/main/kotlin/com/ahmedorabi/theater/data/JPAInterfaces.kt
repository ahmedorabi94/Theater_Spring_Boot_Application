package com.ahmedorabi.theater.data

import com.ahmedorabi.theater.domain.Seat
import org.springframework.data.jpa.repository.JpaRepository

interface SeatRepository : JpaRepository<Seat, Long>