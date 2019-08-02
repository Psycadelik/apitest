package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RestCat implements CommandLineRunner {
    @Override
    public void run(String...args) throws Exception{
        RestTemplate restTemplate = new RestTemplate();

        // Step 1 . Register an account

        System.out.println("Registering an account to the portal(POST) ------------------------");

        Student student = new Student("Adrian Francis Nduva", "090237");

        Student createdStudent = restTemplate.postForObject(
          "http://10.51.10.111:1000/registrations",
          student,Student.class
        );

        System.out.println(createdStudent.toString());

        //Step 2. view all available units

        System.out.println("Fetching list of all available units(GET)------------------------");


//        ResponseEntity<List<Unit>> response = restTemplate.getForEntity("http://10.51.10.111:1000/units",Unit.class);
//        List<Unit> units = response.getBody();

        ResponseEntity<List<Unit>> response = restTemplate.exchange(
                "http://10.51.10.111:1000/units",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Unit>>() {
                });
        List<Unit> units = response.getBody();

        for(Unit unit:units){
            System.out.println(unit.toString());
        }


        //Step 3. Enroll for unit of choice

        System.out.println("Enrolling for unit of choice(POST) ------------------------");

        Unit enrolledUnit = restTemplate.postForObject(
                "http://10.51.10.111:1000/1/1/enroll/2",
                null,
                Unit.class);

        System.out.println(enrolledUnit.toString());

        //Step 4. Validate the unit

        System.out.println("Validating enrolled unit choice(POST) ------------------------");

//        System.out.println();
        Unit validateUnit = restTemplate.postForObject(
                "http://10.51.10.111:1000/1/validate/",
                null,
                Unit.class);

        System.out.println(validateUnit.toString());

    }
}
