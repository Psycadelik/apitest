//package com.example.demo;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//@Component
//public class RestTesting implements CommandLineRunner {
//
//    @Override
//    public void run(String...args) throws Exception{
//        RestTemplate restTemplate = new RestTemplate();
//
//        String baseUrl = "http://10.51.10.111:8080/";
//
//        ResponseEntity<List<University>> response = restTemplate.exchange(
////                String.format(baseUrl, "universities"),
//                "http://10.51.10.111:8080/universities",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<University>>() {
//                });
//
//        List<University> universities = response.getBody();
//
//        for(University university:universities){
//            System.out.println(university.toString());
//        }
//
//        System.out.println("Find One(GET)--------------------------------------------------");
//
//        University university = restTemplate.getForObject(
//                "http://10.51.10.111:8080/universities/2",
//                University.class);
//        System.out.println(university.toString());
//
//
//        System.out.println("Creating(POST) -------------------------------------------------");
//
//        University newUniversity = new University("Maasai Mara","Narok", 2000,0.36,36.78);
//        University createdUniversity = restTemplate.postForObject(
//                "http://10.51.10.111:8080/universities/",
//                newUniversity,University.class
//        );
//
//        System.out.println(createdUniversity.toString());
//
//        String createCourseUrl = "http://10.51.10.111:8080/universities/" + createdUniversity.getId() + "/courses/";
//
//        Course newCourse = new Course("Bsc PS");
//        Course createdCourse = restTemplate.postForObject(
//                createCourseUrl,
//                newCourse,Course.class
//        );
//
//        System.out.println(createdCourse.toString());
//
//
//    }
//}
