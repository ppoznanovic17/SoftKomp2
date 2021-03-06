package org.petarbogdan.service1.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "user_sub")
@NoArgsConstructor @AllArgsConstructor
public class UserSubRel  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    Long userId;


    Long subId;




    public Long getId() {
        return id;
    }

    public Long getSubId() {
        return subId;
    }

    public Long getUserId() {
        return userId;
    }



    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
