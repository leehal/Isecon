package com.kh.mini.controller.VO;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter

public class MemberVo {
    private String id;
    private String pwd;
    private String name;
    private String email;
    private Date join;
}

