package com.mjtool.mjtool.web.controller;

import com.mjtool.mjtool.model.enumeration.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class EnumsController {

    @RequestMapping(value="/enums/{enumName}", method = RequestMethod.GET)
    public  Object[] getEnum(@PathVariable String enumName) {
        switch (enumName) {
            case "astralSigns" :
                return AstralSigns.values();
            case "birthPlaces" :
                return Birthplaces.values();
            case "eyesColors" :
                return EyesColors.values();
            case "genders" :
                return Genders.values();
            case "hairColors" :
                return HairColors.values();
            case "races" :
                return Races.values();
            case "skillsname" :
                return SkillsName.values();
            default:
                return new Object[0];
        }
    }
}
