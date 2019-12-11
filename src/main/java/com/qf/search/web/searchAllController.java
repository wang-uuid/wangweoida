package com.qf.search.web;


import com.qf.search.entity.Problem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


/**
 * @program: changzhi
 * @description
 * @author: 王伟达
 * @create: 2019-12-10 21:02
 **/
@Controller
public class searchAllController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    /*@RequestMapping("/index")
    public String search(){
        ArrayList<Problem> list = new ArrayList<>();
        list.add(new Problem(1,"java"));
        list.add(new Problem(1,"java"));
        list.add(new Problem(1,"java"));
        list.add(new Problem(1,"java"));
        list.add(new Problem(1,"java"));
        list.add(new Problem(1,"java"));
        list.add(new Problem(1,"java"));
        list.add(new Problem(1,"java"));
        return "index";
    }*/
}
