package com.elshaddai.cattletracker.domain

import java.util.*

data class Cattle(
    val id: Int,
    val name: String,
    val cattleNumber: Int,
    val weight: Double,
    val dateOfBirth: Long,
    val isLactating: Boolean,
    val isPregnant: Boolean,
    val isBorneInOwnFarm: Boolean,
    val latestInseminationDate: Long,
    val breed: Breed,
    val cattleNumberOfMother: Int,
    val childrenCattleNumber: List<Int>,
    val sex: Sex,
    val purchasePrice: Int
)
