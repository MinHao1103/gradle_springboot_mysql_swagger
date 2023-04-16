package com.example.demo.dao;

import com.example.demo.moedl.User;
import com.example.demo.util.SQLReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class TestDao {

    private Logger log = LoggerFactory.getLogger(TestDao.class);

    private final SQLReader reader = SQLReader.getInstance(getClass());

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /*
     * 取得所有 User 資料
     * @param 無
     * @return List<User> User 清單
     * */
    public List<User> getUserList() {
        String sql = reader.getString("getUserList");
        return namedParameterJdbcTemplate.query(sql , new BeanPropertyRowMapper<>(User.class));
    }

}
