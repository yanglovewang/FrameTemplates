package com.yang.springbootmybatis.Mapper;

import com.yang.springbootmybatis.bean.Company;
import com.yang.springbootmybatis.bean.Boss;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CompanyMapper {

    Company findCompanyById(Integer id);

    void insertCompany(@Param("company") Company company);

    int insertCompany2(@Param("company") Company company);

    Company findCompany(Company company);

    Company findCompanyByParams(Map map);

    Company findCompanyByParams2(@Param("id") int id, @Param("userId") int userId);

    List<Company> findCompanyByIds(List<Integer> list);

    Boss findUserById(Integer id);

}
