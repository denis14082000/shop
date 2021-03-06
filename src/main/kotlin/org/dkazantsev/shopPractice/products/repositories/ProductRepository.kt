package org.dkazantsev.shopPractice.products.repositories

import org.dkazantsev.shopPractice.products.models.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long>