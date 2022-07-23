package org.dkazantsev.shopPractice.products.controllers.dto

import java.net.URL
import java.util.UUID

data class ProductElem(
    val id: UUID,
    val name: String,
    val price: Double,
    val imageUrl: URL?,
    val description: String?,
)
