package com.example.Oauth.repository;

import com.example.Oauth.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    public Member findByUsername(String username);
}