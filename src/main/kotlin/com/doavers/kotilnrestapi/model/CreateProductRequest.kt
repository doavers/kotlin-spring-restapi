package com.doavers.kotilnrestapi.model

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull

data class CreateProductRequest(

    @field: NotBlank
    val id: String?,

    @field: NotBlank
    val name: String?,

    @field: NotNull
    @field: Min(value = 0)
    val price: Long?,

    @field:NotNull
    @field:Min(value = 0)
    val quantity: Int?

)