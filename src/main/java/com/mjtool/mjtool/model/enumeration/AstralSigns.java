package com.mjtool.mjtool.model.enumeration;


import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum AstralSigns {
   WYMUNND_ANACHORETE("Wymund l'Anachorète"),
   GRANDE_CROIX("La grande croix"),
   GNUTHUS_BUFFLE("Gnuthus le buffle"),
   DRAGOMAS_DRAGON("Dragomas le dragon"),
   CREPUSCULE("Le crépuscule"),
   FOURREAU_GRUNGNI("Le fourreau de Grungni"),
   MAMMIT_SAGE("Mammit le sage"),
   MUMMIT_FOU("Mummit le fou"),
   DEUX_BOEUFS("Les deux boeufs"),
   DANSEUR("Le danseur"),
   TAMBOUR("Le tambour"),
   FLUTISTE("Le flûtiste"),
   VOBIST_PALE("Vobist le pâle"),
   CHARRETTE_BRISEE("La charrette brisée"),
   CHEVRE_SAUVAGE("La chèvre sauvage"),
   CHAUDRON_RHYA("Le chaudron de Rhya"),
   CACKELFAX_COQ("Cackelfax le coq"),
   GRIMOIRE("Le grimoire"),
   ETOILE_SORCIER("L'étoile du sorcier");



   private String value;
   private String name;

   AstralSigns(String value) {
      this.value = value;
      name = name();
   }

   public String getValue() {
      return value;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
