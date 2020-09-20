package com.service.itsm.group;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

//@Entity
//@Table(name="GROUP_MEMBER_temp")
public class GroupMember {

  //  @Column(name="SOURCE")
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


}
