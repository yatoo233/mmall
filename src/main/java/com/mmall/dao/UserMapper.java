package com.mmall.dao;

import com.mmall.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    User selectLogin(String username,String password);

    int checkEmail(String str);

    String selectQuestionByUsername(String username);

    int checkAnswer(String username,String question,String answer);

    int updatePasswordByUsername(String username,String passwordNew);

    int checkPassword(String password,int userId);

    int checkEmailByUserId(String email,int userId);

}