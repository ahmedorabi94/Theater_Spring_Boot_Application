package com.ahmedorabi.theater.domain

import javax.persistence.*

@Entity
@Table(name = "Performance")
data class Performance(@Id @GeneratedValue (strategy=GenerationType.AUTO)
                        val id: Long,
                       val title: String) {

    @OneToMany(mappedBy = "performance")
    lateinit var bookings: List<Booking>
}