package com.ahmedorabi.theater.domain

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "Seat")
data class Seat(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
                val id: Long,
                val rowseat: Char,
                val num: Int,
                val price: BigDecimal,
                val description: String) {
    override fun toString(): String = "Seat $rowseat-$num $$price ($description)"
}