package com.backend_challenge.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.Date;

@Data
@Document
public class Campain {


    @Id
    private String id;
    private String campainName;
    private Date dateStart;
    private Date dateEnd;


    public void plusDateEnd( ) {
        Calendar c = Calendar.getInstance();
        c.setTime(this.dateEnd);
        c.set(Calendar.DATE, +1);
        this.dateEnd = c.getTime();
    }
}
