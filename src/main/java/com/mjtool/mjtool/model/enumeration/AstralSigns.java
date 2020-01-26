package com.mjtool.mjtool.model.enumeration;


import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum AstralSigns {
   CHEVRE_SAUVAGE("Chèvre sauvage"),
   TEST("test");


   private String value;

   AstralSigns(String value) {
      this.value = value;
   }

   public String getValue() {
      return value;
   }

   public void setValue(String value) {
      this.value = value;
   }

}
