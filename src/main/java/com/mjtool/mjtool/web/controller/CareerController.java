package com.mjtool.mjtool.web.controller;

import com.mjtool.mjtool.model.enumeration.Careers;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class CareerController {

    @RequestMapping(value="/careers", method = RequestMethod.GET)
    public  Careers[] careerList() {
        return Careers.values();
    }

    @RequestMapping(value="/careers/basics", method = RequestMethod.GET)
    public Careers[] getBasicCareers() {
        Careers[] careerList = Careers.values();
        for (Careers career : careerList) {
            if (career.getBasic() == true) {

            }
        }

//TODO
    }


}
