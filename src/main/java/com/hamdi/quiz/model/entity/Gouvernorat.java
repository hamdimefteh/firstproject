package com.hamdi.quiz.model.entity;


        import java.util.Date;
        import java.util.List;

        import javax.persistence.*;
        import javax.validation.constraints.NotNull;
        import javax.validation.constraints.Size;
@Entity
@Table(name = "GOUVERNORAT")
public class Gouvernorat {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    private Long id;

    public String getNomgouvernorat() {
        return nomgouvernorat;
    }

    public void setNomgouvernorat(String nomgouvernorat) {
        this.nomgouvernorat = nomgouvernorat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gouvernorat)) return false;

        Gouvernorat that = (Gouvernorat) o;

        return getId() != null ? getId().equals(that.getId()) : that.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    public Long getId() {
        return id;


    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NOMGOUVERNORAT", length = 50)
    @NotNull
    @Size(min = 4, max = 50)
    private String nomgouvernorat;


    @OneToMany(mappedBy = "gouvernorat")
    private List<Centre> centres;
}