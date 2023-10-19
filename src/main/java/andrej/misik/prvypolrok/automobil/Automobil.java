package andrej.misik.prvypolrok.automobil;

import java.util.Objects;

public class Automobil {

   String Znacka;
   boolean JeNastartovane;
   int AktualnaRychlost;

   public Automobil(String znacka){
      this.Znacka = znacka;
      this.JeNastartovane = false;
      this.AktualnaRychlost = 0;
   }

   public int getAktualnaRychlost() {
      return AktualnaRychlost;
   }

   public void setAktualnaRychlost(int aktualnaRychlost) {
      AktualnaRychlost = aktualnaRychlost;
   }

   public boolean isJeNastartovane() {
      return JeNastartovane;
   }

   public void setJeNastartovane(boolean jeNastartovane) {
      JeNastartovane = jeNastartovane;
   }

   public String getZnacka() {
      return Znacka;
   }

   public void setZnacka(String znacka) {
      Znacka = znacka;
   }

   public void nastartovatAuto(){
         if (!JeNastartovane){
            JeNastartovane = true;
         }
   }

   public void pohybAuta(int rychlost){
      if (JeNastartovane){
         AktualnaRychlost = AktualnaRychlost + rychlost;
      }
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Automobil automobil = (Automobil) o;
      return JeNastartovane == automobil.JeNastartovane && AktualnaRychlost == automobil.AktualnaRychlost && Objects.equals(Znacka, automobil.Znacka);
   }

   @Override
   public int hashCode() {
      return Objects.hash(Znacka, JeNastartovane, AktualnaRychlost);
   }
}
