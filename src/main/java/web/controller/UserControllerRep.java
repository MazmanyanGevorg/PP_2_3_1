//package web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import web.model.User;
//import web.service.UserService;
//import web.service.UserServiceRep;
//
//@Controller
////@RequestMapping("/users")
//public class UserControllerRep {
//
//    private final UserServiceRep userServiceRep;
//    private final UserService userService;
//
//    @Autowired
//    public UserControllerRep(UserServiceRep userServiceRep, UserService userService) {
//        this.userServiceRep = userServiceRep;
//        this.userService = userService;
//    }
//
//    /////////////////////////////////list////////////////////////////////////////
//
//    @GetMapping("/")
//    public String usersList(Model model) {
//        model.addAttribute("users", userService.getAllUsers());
//        return "/list";
//    }
//
//
////
////    @GetMapping("/")
////    public String index(Model model) {
////        model.addAttribute("users", userServiceRep.findAll());
////        return "/list";
////    }
////
////    //Список всех users
////    @GetMapping("/users/list") // путь в браузере (Model model,@ModelAttribute("flashMessage") String flashAttribute)
////    public String viewUsers(Model model) {
////        model.addAttribute("users", userService.getAllUsers()); // usersAll -> "${usersAll}" в users.html файле
////        return "/list"; //название файла -> list.html
////    }
//
//    ////////////////////////////////create new user////////////////////////////////////////
//
//    @PostMapping("/new")
//    public String newUser(@ModelAttribute User user) {
//        userService.addUser(user);
//        return "redirect:/";
//    }
//
//
//
//
////    @GetMapping("/new")
////    public String newUser(@ModelAttribute("user") User user) {
////        return "/new_user";
////    }
////
////    @PostMapping("/new")
////    public String create(@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {
////        if (bindingResult.hasErrors()) {
////            return "/new_user";
////        }
////        userServiceRep.save(user);
////        return "redirect:/";
////    }
////    @GetMapping("/users/new")
////    public String newUserForm(Map<String, Object> model) {
////        User user = new User();
////        model.put("user", user);
////        return "/new_user";
//
////    }
//
////////////////////////////////edit/update/showById/////////////////////////////////////////////
//
//    @PostMapping("/edit")
//    public String edit(@ModelAttribute User user) {
//        userService.updateUser(user);  /////////// Тут пересмотреть
//        return "redirect:/";
//    }
//
////    @GetMapping("/edit")
////    public String showById(@RequestParam("userId") int userId, Model model) {
////        model.addAttribute("user", userService.getUserById(userId));
////        return "/edit_user";
////    }
//
////    @PostMapping("/users/edit")
////    public String updateUser(@ModelAttribute("user") User user, @RequestParam Integer id) {
////        user.setId(id);
////        userServiceRep.update(user.getId(), user);
////        return "redirect:/";
////    }
//
////    @GetMapping("/{id}")
////    public String show(@PathVariable("id") int id, Model model) {
////        model.addAttribute("user", userServiceRep.findOne(id));
////        return "/show_user";
////    }
//
////    @PatchMapping("/{id}")
////    public String update(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, @PathVariable("id") int id) {
////        if (bindingResult.hasErrors()) {
////            return "/edit_user";
////        }
////        userServiceRep.update(id, user);
////        return "redirect:/";
////    }
///////////////////////////////////delete///////////////////////////////////////////////
//
//    @PostMapping("/delete")
//    public String delete(@RequestParam("id") Long id) {
//        userService.deleteUser(id);
//        return "redirect:/";
//    }
//
//
//
////    @PostMapping("/users/delete")
////    public String delete(@RequestParam("id") int id) {
////        userServiceRep.delete(id);
////        return "redirect:/";
////    }
//}
