package Modele;
// Generated Sep 12, 2018 9:59:37 AM by Hibernate Tools 4.3.1



/**
 * Administrateurs generated by hbm2java
 */
public class Administrateurs  implements java.io.Serializable {


     private String codeAdmin;
     private String fonction;
     private String nom;
     private String prenom;
     private String mdp;

    public Administrateurs() {
    }

    public Administrateurs(String codeAdmin, String fonction, String nom, String prenom, String mdp) {
       this.codeAdmin = codeAdmin;
       this.fonction = fonction;
       this.nom = nom;
       this.prenom = prenom;
       this.mdp = mdp;
    }
   
    public String getCodeAdmin() {
        return this.codeAdmin;
    }
    
    public void setCodeAdmin(String codeAdmin) {
        this.codeAdmin = codeAdmin;
    }
    public String getFonction() {
        return this.fonction;
    }
    
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getMdp() {
        return this.mdp;
    }
    
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }




}


