package com.neuedu.yyzxproject.mapper;

import com.neuedu.yyzxproject.pojo.Menu;
import com.neuedu.yyzxproject.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface UserMapper {
    public User login(User user);
    public List<Menu> getMenusByRole(@Param("roleId") int roleId); // 通过角色来获取所有的菜单

    public List<Menu> getMenusByParentId(@Param("menuId") int menuId); // 通过上一级菜单的id来获取下一层菜单的id
}