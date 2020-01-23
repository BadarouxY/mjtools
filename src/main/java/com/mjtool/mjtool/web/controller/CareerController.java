package com.mjtool.mjtool.web.controller;

import com.mjtool.mjtool.model.enumeration.Careers;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

@CrossOrigin
@RestController
public class CareerController {

    @RequestMapping(value="/careers", method = RequestMethod.GET)
    public  Careers[] careerList() {
        return Careers.values();
    }

    @RequestMapping(value="/careers/basics", method = RequestMethod.GET)
    public ArrayList<Careers> getBasicCareers() {
        ArrayList<Careers> basicCareers = new ArrayList<>();
        for (Careers career : Careers.values()) {
            if (career.getBasic() == true) {
                basicCareers.add(career);
            }
        }
            return basicCareers;
    }

    @RequestMapping(value="/careers/advanced", method = RequestMethod.GET)
    public ArrayList<Careers> getAdvancedCareers() {
        ArrayList<Careers> advancedCareers = new ArrayList<>();
        for (Careers career : Careers.values()) {
            if (career.getAdvanced() == true) {
                advancedCareers.add(career);
            }
        }
        return advancedCareers;
    }


}
