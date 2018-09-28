package Modele;
// Generated Sep 12, 2018 9:59:37 AM by Hibernate Tools 4.3.1



/**
 * IngredientsLanguesId generated by hbm2java
 */
public class IngredientsLanguesId  implements java.io.Serializable {


     private String idIngredient;
     private String codeLangue;

    public IngredientsLanguesId() {
    }

    public IngredientsLanguesId(String idIngredient, String codeLangue) {
       this.idIngredient = idIngredient;
       this.codeLangue = codeLangue;
    }
   
    public String getIdIngredient() {
        return this.idIngredient;
    }
    
    public void setIdIngredient(String idIngredient) {
        this.idIngredient = idIngredient;
    }
    public String getCodeLangue() {
        return this.codeLangue;
    }
    
    public void setCodeLangue(String codeLangue) {
        this.codeLangue = codeLangue;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof IngredientsLanguesId) ) return false;
		 IngredientsLanguesId castOther = ( IngredientsLanguesId ) other; 
         
		 return ( (this.getIdIngredient()==castOther.getIdIngredient()) || ( this.getIdIngredient()!=null && castOther.getIdIngredient()!=null && this.getIdIngredient().equals(castOther.getIdIngredient()) ) )
 && ( (this.getCodeLangue()==castOther.getCodeLangue()) || ( this.getCodeLangue()!=null && castOther.getCodeLangue()!=null && this.getCodeLangue().equals(castOther.getCodeLangue()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdIngredient() == null ? 0 : this.getIdIngredient().hashCode() );
         result = 37 * result + ( getCodeLangue() == null ? 0 : this.getCodeLangue().hashCode() );
         return result;
   }   


}


