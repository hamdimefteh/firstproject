
package com.hamdi.quiz.model.entity;


        import java.util.Date;
        import java.util.List;

        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.FetchType;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;
        import javax.persistence.JoinColumn;
        import javax.persistence.JoinTable;
        import javax.persistence.ManyToMany;
        import javax.persistence.SequenceGenerator;
        import javax.persistence.Table;
        import javax.persistence.Temporal;
        import javax.persistence.TemporalType;
        import javax.validation.constraints.NotNull;
        import javax.validation.constraints.Size;

@Entity
@Table(name = "SPECIALITE")
public class Specialite {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    private Long id;

    @Column(name = "CODESPECIALITE", length = 50)
    @NotNull
    @Size(min = 4, max = 50)
    private String codespecialite;


    @Column(name = "LIBSPECIALITE", length = 200)
    @NotNull
    @Size(min = 4, max = 200)
    private String libspecialite;


    @Column(name = "LIBDIPLOME", length = 200)
    @NotNull
    @Size(min = 4, max = 200)
    private String libdiplome;

    @Column(name = "TYPESPECIALITE", length = 50)
    @NotNull
    @Size(min = 2, max = 50)
    private String typespecialite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodespecialite() {
        return codespecialite;
    }

    public void setCodespecialite(String codespecialite) {
        this.codespecialite = codespecialite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Specialite)) return false;

        Specialite that = (Specialite) o;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    public String getLibspecialite() {
        return libspecialite;

    }

    public void setLibspecialite(String libspecialite) {
        this.libspecialite = libspecialite;
    }

    public String getLibdiplome() {
        return libdiplome;
    }

    public void setLibdiplome(String libdiplome) {
        this.libdiplome = libdiplome;
    }

    public String getTypespecialite() {
        return typespecialite;
    }

    public void setTypespecialite(String typespecialite) {
        this.typespecialite = typespecialite;
    }
}