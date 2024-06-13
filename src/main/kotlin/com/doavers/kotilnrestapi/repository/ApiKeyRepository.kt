package com.doavers.kotilnrestapi.repository

import com.doavers.kotilnrestapi.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository : JpaRepository<ApiKey, String> {
}