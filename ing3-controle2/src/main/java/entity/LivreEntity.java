package entity;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity(name = "Livre")
public class LivreEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String titre;
    private String categorie;

    public LivreEntity(Long id, String titre, String catégorie, List<ExemplaireEntity> compte) {
        this.id = id;
        this.titre = titre;
        this.categorie = categorie;
        this.compte = compte;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "LivreEntity{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", catégorie='" + categorie + '\'' +
                ", compte=" + compte +
                '}';
    }

    public LivreEntity() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCatégorie() {
        return categorie;
    }

    public void setCatégorie(String catégorie) {
        this.categorie = catégorie;
    }

    public List<ExemplaireEntity> getCompte() {
        return compte;
    }

    public void setCompte(List<ExemplaireEntity> compte) {
        this.compte = compte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LivreEntity)) return false;
        if (!super.equals(o)) return false;

        LivreEntity that = (LivreEntity) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getTitre() != null ? !getTitre().equals(that.getTitre()) : that.getTitre() != null) return false;
        if (getCategorie() != null ? !getCategorie().equals(that.getCategorie()) : that.getCategorie() != null)
            return false;
        return getCompte() != null ? getCompte().equals(that.getCompte()) : that.getCompte() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        result = 31 * result + (getTitre() != null ? getTitre().hashCode() : 0);
        result = 31 * result + (getCategorie() != null ? getCategorie().hashCode() : 0);
        result = 31 * result + (getCompte() != null ? getCompte().hashCode() : 0);
        return result;
    }

    @OneToMany(


            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
     private List<ExemplaireEntity> compte = new ArrayList<>();
}
