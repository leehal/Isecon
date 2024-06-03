package com.kh.mini.controller;

import com.kh.mini.DAO.MemberDAO;
import com.kh.mini.controller.VO.MemberVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
@Slf4j
// 동일 출처 오류
public class MemberController {
    // Get 방식, 회원 정보 조회
    @GetMapping("/members")
    public ResponseEntity<List<MemberVo>> memberList(@RequestParam String name) {
        log.debug("회원 이름으로 조회 : " + name);
        MemberDAO dao = new MemberDAO();
        List<MemberVo> list = dao.memberSelect(name);
        return ResponseEntity.ok(list);
    }
     // POST 방식, 회원 가입
    @PostMapping("/signup")
    public ResponseEntity<Boolean> memberReg(@RequestBody MemberVo member) {
        MemberDAO dao = new MemberDAO();
        boolean isTrue = dao.memberRegister(member);
        return ResponseEntity.ok(isTrue);
    }

    // Delete 방식
    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> memberDel(@RequestBody Map<String, String> data) {
        String getId = data.get("id");
        MemberDAO dao = new MemberDAO();
        boolean isTrue = dao.memberDelete(getId);
        return ResponseEntity.ok(isTrue);
    }
}