package com.yang.springbootmybatis.bean;

import java.util.List;

public class Boss {

    private Integer id;
    private String createTime;
    List<Company> list;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
