package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;




@Data
@Entity(name = "Utilisateur")
public class UtilisateurEntity {
    public Long getId() {
        return id;
    }

    public UtilisateurEntity() {
    }

    @Override
    public String toString() {
        return "UtilisateurEntity{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", compte=" + compte +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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
        if (!(o instanceof UtilisateurEntity)) return false;
        if (!super.equals(o)) return false;

        UtilisateurEntity that = (UtilisateurEntity) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getNom() != null ? !getNom().equals(that.getNom()) : that.getNom() != null) return false;
        if (getPrenom() != null ? !getPrenom().equals(that.getPrenom()) : that.getPrenom() != null) return false;
        return getCompte() != null ? getCompte().equals(that.getCompte()) : that.getCompte() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        result = 31 * result + (getNom() != null ? getNom().hashCode() : 0);
        result = 31 * result + (getPrenom() != null ? getPrenom().hashCode() : 0);
        result = 31 * result + (getCompte() != null ? getCompte().hashCode() : 0);
        return result;
    }

    @Id

    @GeneratedValue
    private Long id;
    private String nom;

    public UtilisateurEntity(Long id, String nom, String prenom, List<ExemplaireEntity> compte) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.compte = compte;
    }

    private String prenom;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exempl_id")
    private List<ExemplaireEntity> compte = new ArrayList<>();
}
