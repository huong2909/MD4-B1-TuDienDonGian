package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DicController {
    @GetMapping(value = "/")
    public String index() {
        return "index";
    }



    @PostMapping ("/dic")
    public String Dic(@RequestParam String search, Model model){
        Map<String,String> dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
        String result = dic.get(search);
        if (result==null){
            model.addAttribute("result","Khong tim thay");
        } else {
            model.addAttribute("result",result);
        }

        return "result";
    }
}
