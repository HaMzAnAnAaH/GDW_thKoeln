package de.thkoeln.gm.greetingsserverspring

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*


@Controller
class GreetingsController {

    @GetMapping("/")
    @ResponseBody
    fun sayHelloWorld(): String {
        return "Hello World"
    }

    @GetMapping("/greeting")
    @ResponseBody
    fun sayHello(name: String): String {
        return "Hello ${name}"
    }

    @GetMapping("/postgreet")
    @PostMapping("/postgreeting")
    @ResponseBody
    fun postHelloWorld(): String {
        return "Hello World from POST request"
    }
}