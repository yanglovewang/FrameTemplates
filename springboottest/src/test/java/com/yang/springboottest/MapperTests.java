package com.yang.springboottest;


import com.yang.springboottest.bean.Company;
import com.yang.springboottest.bean.User;
import com.yang.springboottest.mapper.CompanyMapper;
import com.yang.springboottest.mapper.UserMapper;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class MapperTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private CompanyMapper companyMapper;

	@Test
	@Rollback
	public void findByName() throws Exception {
		User u = userMapper.findByName(666668);
		User user = new User();
		user.setId(666666);
		User uu = userMapper.findUser(user);
		System.out.printf(u.toString());
		System.out.printf(uu.toString());
	}

	@Test
	@Rollback
	public void findCompany() throws Exception {
		Company company = new Company();
		company.setId(10019);
		Company company1 = companyMapper.selectCompalyById(company);
		System.out.println("company == " + company1.toString());
	}



}