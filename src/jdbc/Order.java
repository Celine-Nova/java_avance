package jdbc;

public class Order {
   private int id;
   private String typePresta;
   private String designation;
   private int nombreJours;
   private int  prixUnitaire;

   public Order(int id, String typePresta, String designation, int nombreJours, int prixUnitaire) {
      this.id = id;
      this.typePresta = typePresta;
      this.designation = designation;
      this.nombreJours = nombreJours;
      this.prixUnitaire = prixUnitaire;
   }

   @Override
   public String toString() {
      return "Order{" +
              "id=" + id +
              ", typePresta='" + typePresta + '\'' +
              ", designation='" + designation + '\'' +
              ", nombreJours=" + nombreJours +
              ", prixUnitaire=" + prixUnitaire +
              '}';
   }

   public void setId(int id) {
      this.id = id;
   }
   public int getId() {
      return id;
   }
   public String getTypePresta() {
      return typePresta;
   }

   public void setTypePresta(String typePresta) {
      this.typePresta = typePresta;
   }

   public String getDesignation() {
      return designation;
   }

   public void setDesignation(String designation) {
      this.designation = designation;
   }

   public int getNombreJours() {
      return nombreJours;
   }

   public void setNombreJours(int nombreJours) {
      this.nombreJours = nombreJours;
   }

   public int getPrixUnitaire() {
      return prixUnitaire;
   }

   public void setPrixUnitaire(int prixUnitaire) {
      this.prixUnitaire = prixUnitaire;
   }

}

