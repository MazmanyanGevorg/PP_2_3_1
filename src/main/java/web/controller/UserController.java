//package web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//import web.model.User;
//import web.service.UserService;
//
//@Controller
//@RequestMapping("/users")
//public class UserController {
//
//    private UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    public UserController() {
//    }
//
//    //Список всех users
//    @GetMapping() // путь в браузере (Model model,@ModelAttribute("flashMessage") String flashAttribute)
//    public String viewUsers(Model model) {
//        model.addAttribute("listUser", userService.getAllUsers()); // usersAll -> "${usersAll}" в users.html файле
//        return "/list"; //название файла -> list.html
//    }
//
////    @GetMapping("/new")
////    public String newUserForm(Map<String, Object> model) {
////        model.put("user", new User());
////        return "new_user";
////    }
//
//    @GetMapping("/")
//    public String showById(@RequestParam("userId") int userId, Model model) {
//        model.addAttribute("user", userService.getUserById(userId));
//        return "/edit_user";
//    }
//
////    @GetMapping("/new")
////    public String newUserForm(Model model) {
////        model.addAttribute("user", new User());
////        // "user" - это в new_user.html object="${user}" в <form>
////        return "/new_user";
////    }
//
//    //    это тоже самое делает что и метод сверху
//    @GetMapping("/new")
//    public String newUserForm(@ModelAttribute("user") User user) {
//        return "/new_user";
//    }
//
//    @PostMapping()
//    public String addUser(@ModelAttribute("user") User user) { // "user" - это объект из html формы <form>
//        userService.addUser(user);
//        return "redirect:/users";
//    }
//
//// Тоже самое что и метод newUserForm
////    @PostMapping(value = "/save")
////    public String saveUser(@ModelAttribute("user") User user) {
////        userService.updateUser(user);
////        return "redirect:";
////    }
//
//    @GetMapping("/edit")
//    public ModelAndView editUserForm(@RequestParam int id) {
//        ModelAndView mav = new ModelAndView("/edit_user");
//        User user = userService.getUserById(id);
//        mav.addObject("user", user);
//        return mav;
//    }
//
//    @PostMapping("/edit")
//    public String editUser(@ModelAttribute("user") User updateUser, int userId) {
//        userService.updateUser(userId, updateUser);
//        return "redirect:/";
//    }
//
//    @PostMapping("/delete")
//    public String deleteUserForm(@RequestParam int id) {
//        userService.deleteUser(id);
//        return "redirect:/";
//    }
//}
