package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserServiceRep;

import javax.validation.Valid;

@Controller
//@RequestMapping("/users")
public class UserControllerRep {
    private final UserServiceRep userServiceRep;

    @Autowired
    public UserControllerRep(UserServiceRep userServiceRep) {
        this.userServiceRep = userServiceRep;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("users", userServiceRep.findAll());
        return "/list";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userServiceRep.findOne(id));
        return "/show_user";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user) {
        return "/new_user";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/new_user";
        }
        userServiceRep.save(user);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userServiceRep.findOne(id));
        return "/edit_user";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, @PathVariable("id") int id) {
        if (bindingResult.hasErrors()) {
            return "/edit_user";
        }
        userServiceRep.update(id, user);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        userServiceRep.delete(id);
        return "redirect:/";
    }
}
