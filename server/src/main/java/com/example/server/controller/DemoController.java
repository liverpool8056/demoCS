package com.example.server.controller;

import com.example.server.entity.Human;
import com.example.server.entity.Person;
import com.example.server.entity.TestPerson;
import org.springframework.web.bind.annotation.*;

import java.io.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @PostMapping("/hello")
    public Human hello(@RequestBody Human human){
        return human;
    }

    @GetMapping("/hello")
    public Human hello(){
        Person person = new Person("robin0", "hello");
        TestPerson a = new TestPerson("a", 1);
        a.hashCode();
        return new Human(person, "China");
    }

    @GetMapping(value = "/null", produces = "application/json")
    public String myNull(){
        return "";
    }


    @GetMapping("/latency")
    public String longLatencyResp() throws InterruptedException {
        Thread.sleep(5000);
        Object a = new Object();
        String b = new String();
        return "OK";
    }

    @GetMapping("/hugebody")
    public String hugeBody() throws IOException {
        File f = new File("/tmp/32.log");
        FileInputStream input = new FileInputStream(f);
        StringBuilder resultStringBuilder = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(input));
        String line;
        while((line = br.readLine())!= null){
            resultStringBuilder.append(line);
        }
        return resultStringBuilder.toString();
    }
}
