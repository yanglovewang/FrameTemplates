package com.yang.springboottest.server.serverImpl;

import com.yang.springboottest.bean.User;
import com.yang.springboottest.bean.UserCriteria;
import com.yang.springboottest.mapper.UserMapper;
import com.yang.springboottest.server.ExportServer;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExportServerImpl implements ExportServer {

    @Autowired
    UserMapper userMapper;


    /**
     * 查询user列表，查不到返回空集合
     * @param user
     * @return
     */
    @Override
    public List<User> listUser(User user) {

        UserCriteria exemple = new UserCriteria();
        UserCriteria.Criteria criteria = exemple.createCriteria();
        if (StringUtils.isNotBlank(user.getNickname())) {
            criteria.andNicknameEqualTo(user.getNickname());
        }
        if (ObjectUtils.allNotNull(user.getCreateTime())) {
            criteria.andCreateTimeEqualTo(user.getCreateTime());
        }
        if (ObjectUtils.allNotNull(user.getUpdateTime())) {
            criteria.andUpdateTimeEqualTo(user.getUpdateTime());
        }
        if (ObjectUtils.allNotNull(user.getEmail())) {
            criteria.andEmailEqualTo(user.getEmail());
        }
        exemple.setOrderByClause("id desc");
        List<User> list = userMapper.selectByExample(exemple);
        return list;
    }
}
