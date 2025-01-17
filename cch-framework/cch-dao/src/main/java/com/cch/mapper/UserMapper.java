package com.cch.mapper;

import com.cch.model.User;
import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Sun May 31 09:29:36 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Sun May 31 09:29:36 CST 2020
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Sun May 31 09:29:36 CST 2020
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Sun May 31 09:29:36 CST 2020
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Sun May 31 09:29:36 CST 2020
     */
    int updateByPrimaryKey(User record);
}