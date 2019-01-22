package com.yang.springboottest.controller;

import com.yang.springboottest.bean.Teacher;
import com.yang.springboottest.util.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Map;

@Controller
public class VaildAndJsonController {

    private Logger log = LoggerFactory.getLogger(VaildAndJsonController.class);
    /**
     * 测试数据校验，json
     * @param event
     */
    @RequestMapping("/vaild")
    @ResponseBody
    public JsonResult vaildTest(@RequestBody Map<String, Object> map) throws IOException, InterruptedException {
        System.out.println(map.get("name"));
        System.out.println("hello");
        Thread.sleep(2000);
        return new JsonResult();
    }

    @RequestMapping("/bindRequest")
    @ResponseBody
    public JsonResult vaildTest2(@Validated @RequestBody Teacher teacher, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {

        }
        return new JsonResult();
    }


}
