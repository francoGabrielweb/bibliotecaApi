package com.app.web.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
@Controller
public class ControllerLibro {
    @GetMapping("/hola")
    @ResponseBody
    public String agregarLibro() {
        return "Get franco";
    }


    @DeleteMapping("/hola")
    @ResponseBody
    public String borrarLibro() {
        return "Delete   franco";
    }


}
