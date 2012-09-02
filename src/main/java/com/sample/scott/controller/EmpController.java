package com.sample.scott.controller;

import com.sample.scott.domain.EmpModel;
import com.sample.scott.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Subject :
 * User: lke
 * Date: 12. 3. 26
 */
@Controller
public class EmpController {
    @Autowired
    private IEmpService empService;

    @RequestMapping("/index")
    public String list(Map<String, Object> map){
        map.put("empList", empService.getList());
        return  "/emp/list";
    }

    @RequestMapping("/form")
    public String form(Map<String, Object> map) {
        map.put("emp", new EmpModel());
        return "/emp/save";
    }

    @RequestMapping("/info/{empno}")
    public String info(@PathVariable("empno")
                           Integer empno, ModelMap model) {
        model.addAttribute("emp", empService.get(empno));
        return "/emp/save";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("Emp")
                           EmpModel emp, BindingResult result) {
        empService.save(emp);
        return "redirect:/index";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modify(@ModelAttribute("Emp")
                             EmpModel emp, BindingResult result) {
        empService.modify(emp);
        return "redirect:/info/"+emp.getEmpno();
    }

    @RequestMapping("/delete/{empno}")
    public String delete(@PathVariable("empno")
                                Integer empno) {
        empService.remove(empno);
        return "redirect:/index";
    }
}
