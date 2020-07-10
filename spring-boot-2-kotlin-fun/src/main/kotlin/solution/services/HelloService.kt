package solution.services

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun getHello(): String = "hello service"
}