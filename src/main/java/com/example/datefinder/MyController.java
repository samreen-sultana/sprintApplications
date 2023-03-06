package com.example.datefinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;

@RestController
public class MyController {

    @GetMapping("/")
    public String dateMethod(){
        LocalDate now=LocalDate.now();
        DateTimeFormatter formate1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String result = (now.plusDays(100)).format(formate1);
return result;
    }
    
}
