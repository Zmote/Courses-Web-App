package ch.zmotions.domain;

import javax.persistence.*;

// TODO: 28.11.2016 Adjust for User need, this is only a template
@Entity
@Table(name = "Users")
public class UserEO{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pk;

    @Column
    private String vorname;

    @Column
    private String nachname;

    @Column
    private Integer alter;

    public UserEO() {
        this.vorname = "Muster";
        this.nachname ="Meier";
        this.alter = 20;
    }

    public UserEO(String vorname, String nachname, Integer alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Integer getAlter() {
        return alter;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }

    public Long getPk() {
        return pk;
    }
}
