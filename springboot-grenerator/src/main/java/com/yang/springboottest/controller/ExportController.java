package com.yang.springboottest.controller;

import com.yang.springboottest.bean.User;
import com.yang.springboottest.server.ExportServer;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.List;

@Controller
@RequestMapping("/export")
public class ExportController {

    @Autowired
    ExportServer exportServer;

    @RequestMapping("/exportUserList")
    public void exportUserList(User user, HttpServletRequest request) {
        List<User> list = exportServer.listUser(user);
        String[] title = { "企业名称", "联系人电话", "管理费(%)", "状态(1正常/8冻结/9黑名单)", "注册时间" };
        StringBuffer fileName = new StringBuffer().append("企业管理表").append(System.currentTimeMillis()).append(".xls");;
        String sheetName = "企业管理表";
        if (CollectionUtils.isNotEmpty(list)) {
            String[][] cells = null;
            for (int i = 1; i < list.size(); i++) {
                User item = list.get(i);
                for (int j = 0; j < title.length; j++) {
                    cells[i][j] = user.getNickname();
                }
            }
        } else {
            System.out.println();
        }

    }
}
