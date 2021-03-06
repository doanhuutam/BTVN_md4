package controller;

import model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.IAccountService;

@Controller
public class AccountController {
    @Autowired
    IAccountService iAccountService;
    @GetMapping("/show")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("show");
        modelAndView.addObject("list",iAccountService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("account",iAccountService.findById(id));
        return modelAndView;
    }

    @GetMapping("/delete")
    public ModelAndView delete(@RequestParam long id) {
        iAccountService.Delete(iAccountService.findById(id));
        ModelAndView modelAndView = new ModelAndView("redirect:/show");
        return modelAndView;
    }


    @PostMapping("/edit/{id}")
    public ModelAndView edit(@ModelAttribute Account account) {
        iAccountService.edit(account);
        ModelAndView modelAndView = new ModelAndView("redirect:/show");
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute Account account) {
        iAccountService.save(account);
        ModelAndView modelAndView = new ModelAndView("redirect:/acc/show");
        return modelAndView;
    }
}
