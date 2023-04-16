package com.example.demo.service;

import com.example.demo.dao.TestDao;
import com.example.demo.moedl.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    /*
     * 取得所有 User 資料
     * @param 無
     * @return List<User> User 清單
     * */
    public List<User> getUserList() {
        return testDao.getUserList();
    }

}
