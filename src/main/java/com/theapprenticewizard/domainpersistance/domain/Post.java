package com.theapprenticewizard.domainpersistance.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    private @GeneratedValue @Id String id;
    private Date date;
    private String title;
    private String subtitle;
    private String content;
}
