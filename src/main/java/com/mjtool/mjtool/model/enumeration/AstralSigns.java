package com.mjtool.mjtool.model.enumeration;


import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum AstralSigns {
   CHEVRE_SAUVAGE("Chèvre sauvage"),
   TEST("test");


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
