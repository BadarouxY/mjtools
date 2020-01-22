package com.mjtool.mjtool.model.enumeration;


import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape=JsonFormat.Shape.OBJECT)
public enum AstralSigns {
   CHEVRE_SAUVAGE("Chèvre sauvage"),
   TEST("test");


   private String id;

   AstralSigns(String sign) {
   }

   public String getId() {
      return id;
   }
}
