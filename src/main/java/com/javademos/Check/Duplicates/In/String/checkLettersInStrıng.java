package com.javademos.Check.Duplicates.In.String;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/str")
public class checkLettersInStrıng {

    @GetMapping("v1/user/{str}")
    public String checkLetters(@PathVariable String str){
        for(int i = 0; i < str.length()-1; i++){
            for(int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {   // if any two letters are the same return true
                    return "true";
                }
            }
        }
        return "false";
    }
}
