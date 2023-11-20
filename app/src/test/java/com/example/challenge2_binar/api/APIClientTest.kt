package com.example.challenge2_binar.api

import com.example.challenge2_binar.BuildConfig
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import kotlinx.coroutines.runBlocking
import org.junit.Test

class APIClientTest {

    @Test
    fun getInstance() {
        val instance = APIClient.instance.baseUrl().toString()
        assertEquals(BuildConfig.BASE_URL, instance)
    }

    @Test
    fun checkResponseCategoryApi() {
        val service = APIClient.endpointAPIService
        val response = runBlocking { service.getCategory() }
        assertNotNull(response)
    }

    @Test
    fun checkResponseListMenuApi() {
        val service = APIClient.endpointAPIService
        val response = runBlocking { service.getList() }
        assertNotNull(response)

    }
}