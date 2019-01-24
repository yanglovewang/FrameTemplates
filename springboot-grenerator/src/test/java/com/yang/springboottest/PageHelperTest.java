package com.yang.springboottest;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yang.springboottest.bean.User;
import com.yang.springboottest.bean.UserCriteria;
import com.yang.springboottest.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PageHelperTest {
    @Autowired
    UserMapper userMapper;
    @Autowired
    private WebApplicationContext context;
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();  //构造MockMvc
    }


    @Test
    public void boundTest() {
        UserCriteria example = new UserCriteria();
        UserCriteria.Criteria criteria = example.createCriteria();
        example.setOrderByClause("id desc");
        Page<User> page = PageHelper.startPage(1, 5).doSelectPage(()->{
           userMapper.selectByExample(example);
        });

        page.forEach(user -> {
            System.out.println("user ==" + user);
        });
    }

   public void boundTest2() {

   }
}
