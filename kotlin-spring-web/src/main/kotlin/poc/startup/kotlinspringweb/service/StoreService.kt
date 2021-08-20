package poc.startup.kotlinspringweb.service

import org.springframework.stereotype.Component

@Component
class StoreService {

    fun getBlabla(a: String, b:String):String{
        return a+b
    }
}