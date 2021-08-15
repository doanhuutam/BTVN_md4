package controller;

import model.DoanTam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.DoanTamService;

@Controller
public class DoanTamController {
    DoanTamService doanTamService=new DoanTamService();
    @RequestMapping("/")
            public ModelAndView home(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("food",doanTamService.list);
        return modelAndView;

    }
    @GetMapping("/create")
    public ModelAndView showCreate(){
        return new ModelAndView("create");
    }
    @GetMapping("/edit")
    public ModelAndView showEdit(@RequestParam int index){
        ModelAndView modelAndView=new ModelAndView("edit");
        modelAndView.addObject("food",doanTamService.list.get(index));
        return modelAndView;
    }
    @GetMapping ("/delete")
    public ModelAndView delete(@RequestParam int index){
        ModelAndView modelAndView=new ModelAndView("redicert:/");
        doanTamService.delete(index);
        return modelAndView;
    }
    @PostMapping("/create")
        public ModelAndView create(@ModelAttribute DoanTam doanTam){
        ModelAndView modelAndView=new ModelAndView("redicert:/");
        doanTamService.save(doanTam);
        return  modelAndView;
    }
    @PostMapping("/edit")
    public ModelAndView edit(@RequestParam int index,@ModelAttribute DoanTam doanTam){
        ModelAndView modelAndView=new ModelAndView("redicert:/");
        doanTamService.edit(doanTam,index);
        return modelAndView;
    }

}
