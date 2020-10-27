package com.work.bryant.mapper;

import com.work.bryant.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserMapper {
    /**
     * 查询所有
     */
    List<User> selectAll(@Param("is_delete") int is_delete);
}
