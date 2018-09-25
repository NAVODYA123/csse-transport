package com.csse.transport.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "foreign_passenger")
public class ForeignPassenger extends Passenger{


    private String country;
    private Date startDate;
    private Date endDate;

//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            },
//            mappedBy = "passenger")
//    private Set<Journey> journeys = new HashSet<>();

    public String getCountry() {
        return country;
    }

//    public Set<Journey> getJourneys() {
//        return journeys;
//    }
//
//    public void setJourneys(Set<Journey> journeys) {
//        this.journeys = journeys;
//    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    private Boolean valid;


}
