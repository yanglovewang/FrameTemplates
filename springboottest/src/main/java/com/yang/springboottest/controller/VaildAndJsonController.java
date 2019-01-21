package com.yang.springboottest.controller;

import com.yang.springboottest.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Map;

@Controller
public class VaildAndJsonController {

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
}
