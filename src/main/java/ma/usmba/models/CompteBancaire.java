package ma.usmba.models;

import ma.usmba.enums.EtatCompte;
import ma.usmba.enums.TypeCompte;

public class CompteBancaire {
    private Long CompteId;
    private double solde;
    private String devise;
    private TypeCompte typeCompte;
    private EtatCompte etatCompte;

    public CompteBancaire() {
    }

    public CompteBancaire(Long compteId, double solde, String devise, TypeCompte typeCompte, EtatCompte etatCompte) {
        CompteId = compteId;
        this.solde = solde;
        this.devise = devise;
        this.typeCompte = typeCompte;
        this.etatCompte = etatCompte;
    }

    public Long getCompteId() {
        return CompteId;
    }

    public double getSolde() {
        return solde;
    }

    public String getDevise() {
        return devise;
    }

    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public EtatCompte getEtatCompte() {
        return etatCompte;
    }

    public void setCompteId(Long compteId) {
        CompteId = compteId;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public void setTypeCompte(TypeCompte typeCompte) {
        this.typeCompte = typeCompte;
    }

    public void setEtatCompte(EtatCompte etatCompte) {
        this.etatCompte = etatCompte;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "CompteId=" + CompteId +
                ", solde=" + solde +
                ", devise='" + devise + '\'' +
                ", typeCompte=" + typeCompte +
                ", etatCompte=" + etatCompte +
                '}';
    }
}
