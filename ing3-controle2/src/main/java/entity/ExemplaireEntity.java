package entity;

import javax.persistence.*;
import lombok.Data;



@Data
@Entity(name = "Exemplaire")
public class ExemplaireEntity {
    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cons_id")
    private LivreEntity livre;


    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExemplaireEntity)) return false;
        if (!super.equals(o)) return false;

        ExemplaireEntity that = (ExemplaireEntity) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        return getLivre() != null ? getLivre().equals(that.getLivre()) : that.getLivre() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        result = 31 * result + (getLivre() != null ? getLivre().hashCode() : 0);
        return result;
    }

    @Override


    public String toString() {
        return "ExemplaireEntity{" +

                "id=" + id +
                ", livre=" + livre +
                '}';
    }

    public ExemplaireEntity() {
    }

    public LivreEntity getLivre() {
        return livre;
    }

    public void setLivre(LivreEntity livre) {
        this.livre = livre;
    }

    public ExemplaireEntity(Long id, LivreEntity livre) {
        this.id = id;
        this.livre = livre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LivreEntity getConseiller() {
        return livre;
    }

    public void setConseiller(LivreEntity livre) {
        this.livre = livre;
    }

}