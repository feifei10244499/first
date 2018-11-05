package com.feifei.loginsso.dao;

import com.feifei.loginsso.entity.User;
import org.apache.ibatis.annotations.Param;

public interface LoginDao {

    User get(@Param("id") String id);

}
