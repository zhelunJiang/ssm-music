package com.mine.music.service;

import com.mine.music.entity.TbAdmin;
import com.mine.music.mapper.TbAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private TbAdminMapper tbAdminMapper;

    public TbAdmin getAdmin(TbAdmin admin){
        TbAdmin tbAdmin = tbAdminMapper.selectOne(admin);
        return tbAdmin;
    }
}
