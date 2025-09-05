package com.neuedu.yyzxproject.pojo;

import lombok.Data;
import java.util.List;

@Data
public class Menu {

    private Integer id;

    private String menusIndex;

    private String title;

    private String icon;

    private String path;

    private Integer parentId;

    //表示菜单中的子菜单
    private List<Menu> children;
}
