package com.yang.springboottest.controller;

import com.yang.springboottest.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.lang.model.element.NestingKind;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 显示第一页内容
 * 点击第五页 34567
 * 第一页没有上一页
 * 最后一页没有下一页
 *
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/list")
    @ResponseBody
    public JsonResult page(@RequestBody Integer pageId) {
        Integer currentPage = pageId;
        if (currentPage == null) {
            currentPage = 1;
        }
        return new JsonResult(getpagData(currentPage));
    }

    @RequestMapping("/count")
    @ResponseBody
    public JsonResult count() {
        return new JsonResult(100);
    }

    private List getpagData(Integer currentPage) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        int totalPae = list.size() / 10;
        int start = 10 * (currentPage - 1);
        int end = start + 10;
        List<Integer> integers = list.subList(start, end);
        return integers;
    }

}
