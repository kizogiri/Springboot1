/* a controller is a class that is responsible for processing
incoming requests from clients and returning an appropriate
 response. The controller can handle HTTP requests, RESTful services,
 and web services.
 -Create a new Java class and annotate it with @RestController..
 -Define the methods in the class that will handle the incoming requests.
  These methods should be annotated with @RequestMapping,@GetMapping etc..
 -The method should return the appropriate response, which can be a view,
  a JSON object, or any other data format.

 */


package com.dailycodebuffer.SpringBoot.Tutorial.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   // @RequestMapping(value= "/",method= RequestMethod.GET)
    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to Spring-Boot!Refresh again29 and again1121122!";
    }
}
