
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/testdemo")
    public String getText() {
        return "Test Demo";
    }

    // get data from DB
    @GetMapping("/getAll")
    public ResponseEntity<List<Demo>> getAllDemo(Demo demo) {

        List<Demo> demos = demoService.getAllDemo();
        return new ResponseEntity<List<Demo>>(demos, HttpStatus.OK);
    }

    // insert to DB
    @PostMapping("/testSave")
    public ResponseEntity<Demo> addDemo(Demo demo) {
        Demo saveDemo = demoService.addDemo(demo);
        return new ResponseEntity<Demo>(saveDemo, HttpStatus.OK);
    }

    @GetMapping("/getName/{demoId}")
    public String getNameDemo(@PathVariable("demoId") int id, Model model) {
        Demo demo_name = demoService.getDemo(id);
        model.addAttribute("demo", demo_name);
        return "index";
    }

   /* @GetMapping("/testshow")
    public String demoForm(Model model) {
        model.addAttribute("greeting", new Demo());
        return "test";
    }

    @PostMapping("/greeting")
    public String demoSubmit(@ModelAttribute Demo demo) {
        return "result";
    }
*/
    /*
     * @GetMapping("/showName") public String showName(Model model){ Demo demo = new
     * Demo();
     * 
     * model.addAttribute("demo", demo); return "index";
     * 
     * 
     * }
     */

    /*
     * @GetMapping("/teststd") public ResponseEntity<Demo> showList(Demo demo) {
     * Demo saveDemo = demoService.getStdId(demo); return new
     * ResponseEntity<Demo>(saveDemo, HttpStatus.OK); }
     */

}
