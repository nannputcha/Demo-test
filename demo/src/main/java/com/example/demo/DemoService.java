package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public DemoService(DemoRepository demoRepository) {

        this.demoRepository = demoRepository;
    }

    public List<Demo> getAllDemo() {

        return (List<Demo>) demoRepository.findAll();
    }

    public Demo getDemo(int id) {
        return demoRepository.findById(id);
    }

    public Demo addDemo(Demo demo){

        //demo.setId(3);
        demo.setName("Putchamon");
        demo.setFullName("Keerati");
        demo.setStdId(007);
        return demoRepository.save(demo);

    }

    public Demo getStdId(int id){
        return demoRepository.getDemoByStdId(id);
    }

}