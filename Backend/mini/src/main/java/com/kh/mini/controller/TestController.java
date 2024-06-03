package com.kh.mini.controller;

import com.kh.mini.controller.VO.MemberVo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("api")
public class TestController {
    @GetMapping("/name")
    public String getName() {
        return "Get방식이고, 이름은 곰돌이사육사 입니다.";
    }
    // 매개변수를 URL 자체에 값을 담아 요청하는 방식
    @GetMapping("/variable/{var}")
    public String getVar(@PathVariable String var) {
        return "요청하신 페이지 번호는 " + var + "입니다.";
    }
    // Get방식으로 정보를 전달하는 방식
    @GetMapping("/request")
    public String getRequestParam(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String company) {
        return name + " " + email + " " + company;
    }
    @GetMapping("/members")
    public List<Map<String, Object>> findMembers() {
        List<Map<String, Object>> members = new ArrayList<>();
        for(int i = 0; i <= 20; i++) {
            Map<String, Object> member = new HashMap<>();
            member.put("id", 1);
            member.put("name", i+ "번 개발자");
            member.put("age", 10 + i);
            members.add(member);
        }
        return members;
    }
    @GetMapping("/members2")
    public ResponseEntity<List<MemberVo>> ListMembers() {
        List<MemberVo> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            MemberVo vo = new MemberVo();
            vo.setId("이세계아이돌" + i);
            vo.setPwd("1234" + i);
            vo.setName("서용욱");
            vo.setEmail("dyddnr33@naver.com");
            list.add(vo);
        }
        return ResponseEntity.ok(list);
    }
}
