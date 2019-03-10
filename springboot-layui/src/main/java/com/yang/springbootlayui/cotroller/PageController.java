package com.yang.springbootlayui.cotroller;

import com.yang.springbootlayui.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/back")
public class PageController {

    @PostMapping("/page1")
    @ResponseBody
    public Object page(@RequestBody Map map) {
        return JsonResult.SUCCESS;
    }
}
