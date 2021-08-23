package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductControoler {
    @Autowired
    IProductService productService;
    @GetMapping("/show")
    public  ModelAndView show(){
        ModelAndView modelAndView=new ModelAndView("/show");
        modelAndView.addObject("list",productService.finAll());
        return modelAndView;
    }
    @GetMapping("/create")
    public  ModelAndView showcreate(){
        ModelAndView modelAndView=new ModelAndView("/create");
        return modelAndView;
    }
    @GetMapping("/edit/{id}")
    public  ModelAndView showedit(@PathVariable long id){
        ModelAndView modelAndView=new ModelAndView("/edit");
        modelAndView.addObject("list",productService.findbyId(id));
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public  ModelAndView delete(@PathVariable long id){
        productService.delete(productService.findbyId(id));
        ModelAndView modelAndView=new ModelAndView("/product");
        return modelAndView;
    }

    @PostMapping("/create")
    public  ModelAndView create(@ModelAttribute("list")Product product){
        productService.save(product);
        return new ModelAndView("redirect:/product");
    }
    @PostMapping("/edit")
    public  ModelAndView edit(@ModelAttribute("list")Product product){
        productService.edit(product);
        return new ModelAndView("redirect:/product");
    }
}
