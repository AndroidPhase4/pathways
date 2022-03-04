package com.Phase4.pathways

class TechNewsRepository(
) {
    suspend fun getTechNews() = RetrofitInstance.api.getHits()
}