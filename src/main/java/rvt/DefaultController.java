package rvt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import ch.qos.logback.core.model.Model;

@Controller
public class DefaultController {
    String index(@RequestParam(name = "name", required = false, defaultValue = "null") String name, Model model){
        return "index";
    }

    @GetMapping(value = "/hello")
    String hello(){
        return "hello";
    }

    @GetMapping(value = "/about")
    ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView("about");
    
    //Metode priekš koda testēšanas
    
    return modelAndView;
    }
    @GetMapping(value = "/Links")
    String Links(){
        return "Links";
    }
    @GetMapping(value = "/Experiment")
    String Experiment(){
        return "Experiment";
    }
    @GetMapping(value = "/test")
    public ModelAndView testAction(){
        ModelAndView modelAndView = new ModelAndView("test");
        return modelAndView;
    }
    @GetMapping(value = "/registration")
    public ModelAndView RegistartionPage(){
        ModelAndView modelAndView = new ModelAndView("registration");
        return modelAndView;    

    }
    //@GetMapping(value = "/")
    //ModelAndView index(@RequestParam(name="name", required=false, defaultValue="null") String name) {
     //   Student student = new Student("John", "Smith", "a@a.lv", "DP2-4");
     //   List<Student> students = new ArrayList<>();
     //   students.add(student);

     //   ModelAndView modelAndView = new ModelAndView("index");
      //  modelAndView.addObject("students", students);
      //  modelAndView.addObject("date", new Date().toString());
      //  return modelAndView;
    //}//




    //public ModelAndView testAction() {
     //   ModelAndView modelAndView = new ModelAndView("test");


     //   Money macins1 = new Money(5, 55);

      //  modelAndView.addObject("macins1", macins1);

      //  return modelAndView;

    //}
    // public ModelAndView regiterPage() {
     //   ModelAndView modelAndView = new ModelAndView("registration");
      //  return modelAndView;
     //}
}