package com.yang.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Controller
public class home {

    @RequestMapping("home")
    public ModelAndView home(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("home");
        List<Prod> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Prod p = new Prod("yang", 2.3, true);
            list.add(p);
        }
        Prod p = new Prod("zhang", 2.3, true);
        list.add(p);
        request.setAttribute("prods", list);
        request.setAttribute("yang", "杨");

        Prod user = new Prod("zhang", 3.5, true);
        request.setAttribute("user", user);
        return mv;
    }
}
