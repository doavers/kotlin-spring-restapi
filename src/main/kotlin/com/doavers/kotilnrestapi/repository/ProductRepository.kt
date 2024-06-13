package com.doavers.kotilnrestapi.repository

import com.doavers.kotilnrestapi.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {
}