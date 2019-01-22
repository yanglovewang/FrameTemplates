package com.yang.springboottest.mapper;

import com.yang.springboottest.bean.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CompanyMapper {

    Company selectCompalyById(@Param(value="company")Company company);
}
