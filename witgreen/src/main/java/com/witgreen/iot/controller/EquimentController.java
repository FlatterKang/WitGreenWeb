package com.witgreen.iot.controller;

import com.witgreen.iot.bean.Equiment;
import com.witgreen.iot.service.EquimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class EquimentController {

    @Autowired
    EquimentService equimentService;

    @GetMapping("/equiment_center/{userid}")
    String findEquimentByUserId(@PathVariable(value = "userid")Integer id, Model model){

        List<Equiment> equiment = equimentService.findEquimentByUserId(id);

        model.addAttribute("equiment",equiment);
        return "equiment_manager";
    }


}
