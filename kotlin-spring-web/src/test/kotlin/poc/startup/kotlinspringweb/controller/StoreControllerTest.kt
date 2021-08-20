package poc.startup.kotlinspringweb.controller

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import poc.startup.kotlinspringweb.service.StoreService

class StoreControllerTest {

    @InjectMockKs
    lateinit var storeController: StoreController

    @MockK
    lateinit var storeService: StoreService

    @BeforeEach
    fun init() {
        MockKAnnotations.init(this)
    }

    @Test
    fun aaaa(){

        every{ storeService.getBlabla(any(), any())} returns "test Result"

        val test = storeController.getInventory()

        assertThat(test).isNotNull
    }

}