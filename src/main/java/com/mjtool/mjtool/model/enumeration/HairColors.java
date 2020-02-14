package com.mjtool.mjtool.model.enumeration;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum HairColors {
   BRUN("Bruns"),
   BLOND("Blonds"),
   ARGENTE("Argenté"),
   BLOND_CENDRE("Blond cendré"),
   PAILLE("Paille"),
   AUBURN("Auburn"),
   CHATAIN_CLAIR("Chatain clair"),
   CHATAIN("Chatain"),
   NOIR("Noir"),
   ROUX("Roux"),
   BLEU_FONCE("Bleu foncé");

   private String value;
   private String name;

   HairColors(String value) {
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
