package com.neuedu.yyzxproject.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Room {
    private Integer id;
    private String roomFloor;
    private Integer roomNo;
    // 房间对应的床位(多个床位用集合）
    private List<Bed> bedList;
}
