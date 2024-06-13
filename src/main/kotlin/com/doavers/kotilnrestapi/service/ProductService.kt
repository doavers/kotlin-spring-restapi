package com.doavers.kotilnrestapi.service

import com.doavers.kotilnrestapi.model.CreateProductRequest
import com.doavers.kotilnrestapi.model.ListProductRequest
import com.doavers.kotilnrestapi.model.ProductResponse
import com.doavers.kotilnrestapi.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>
}