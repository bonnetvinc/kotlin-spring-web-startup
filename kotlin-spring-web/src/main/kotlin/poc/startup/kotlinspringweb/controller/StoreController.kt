package poc.startup.kotlinspringweb.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import poc.startup.kotlinspringweb.generated.api.StoreApi
import poc.startup.kotlinspringweb.service.StoreService

@Controller
class StoreController : StoreApi {

    @Autowired
    lateinit var storeService: StoreService

    override fun getInventory(): ResponseEntity<Map<String, Int>> {
        val key = storeService.getBlabla("a", "z")

        val testMap = HashMap<String,Int>()
        testMap.put("banana", 4)
        testMap.put("slip", 12)
        testMap.put("a", 1)
        testMap.put(key, 1)

        return ResponseEntity.ok(testMap)
    }
}