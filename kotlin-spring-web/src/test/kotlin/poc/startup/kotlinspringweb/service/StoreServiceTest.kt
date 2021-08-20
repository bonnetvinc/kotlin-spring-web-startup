package poc.startup.kotlinspringweb.service

import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.InjectMockKs
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class StoreServiceTest {

    @InjectMockKs
    lateinit var storeService: StoreService

    @BeforeEach
    fun init() {
        MockKAnnotations.init(this)
    }

    @Test
    fun `aaaa` (){

        val test = storeService.getBlabla("a", "b")

        assertThat(test).isEqualTo("ab")
    }

}