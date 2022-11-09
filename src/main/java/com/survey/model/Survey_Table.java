package com.survey.model;

import javax.persistence.*;

@Entity
@Table(name = "survey_table")
public class Survey_Table {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "id_mail")
    private long id_mail;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_mail", nullable = false, insertable = false, updatable = false)
    private User user;

    @Column(name = "id_category")
    private long id_category;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_category", nullable = false, insertable = false, updatable = false)
    private Category category;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "publish_date")
    private String publish_date;

    @Column(name = "ending_date")
    private String ending_date;

    public Survey_Table () { }
}
