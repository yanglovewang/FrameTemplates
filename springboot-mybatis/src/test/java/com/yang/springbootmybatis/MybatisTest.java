package com.yang.springbootmybatis;

import com.yang.springbootmybatis.Mapper.CompanyMapper;
import com.yang.springbootmybatis.bean.Boss;
import com.yang.springbootmybatis.bean.Company;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.coyote.http11.Constants.a;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MybatisTest {


    @Autowired
    private WebApplicationContext context;
    private MockMvc mvc;

    @Autowired
    private CompanyMapper companyMapper;
    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();  //构造MockMvc
    }


    @Test
    public void boundTest() {
        Company company = companyMapper.findCompanyById(10019);
        System.out.println("company = " + company);
    }

    @Test
    public void insertTest() {
        Company company = new Company();
        company.setUserId(123456);
        company.setCompanyName("zhasyynf");
        companyMapper.insertCompany(company);
    }

    @Test
    public void insertTest2() {
        Company company = new Company();
        company.setUserId(123456);
        company.setCompanyName("zhafwefsyynf");
        int a = companyMapper.insertCompany2(company);
        System.out.println("company1 = " + a);
    }

    @Test
    public void ontOGNL() {
        Company company = new Company();
        company.setUserId(123456);
        company.setId(10019);
        company.setCompanyName("zhafwefsyynf");
        Company company1 = companyMapper.findCompany(company);
        System.out.println("company1 = " + company1);
    }

    @Test
    public void ParamMap() {
        Map map = new HashMap();
        map.put("id", 10019);
        map.put("userId", 123456);
        Company company1 = companyMapper.findCompanyByParams(map);
        System.out.println("company1 = " + company1);
    }

    @Test
    public void ParamsTest() {
        Company company1 = companyMapper.findCompanyByParams2(10019, 123456);
        System.out.println("company1 = " + company1);
    }

    @Test
    public void ParamsListTest() {
        List<Integer> list = new ArrayList<>();
        list.add(10019);
        list.add(10020);
        companyMapper.findCompanyByIds(list);
    }

    @Test
    public void oneMore() {
        Boss user = companyMapper.findUserById(123456);
        System.out.println(user);
    }
}
