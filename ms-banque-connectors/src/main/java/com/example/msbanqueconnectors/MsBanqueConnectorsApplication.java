package com.example.msbanqueconnectors;

import com.example.msbanqueconnectors.dtos.CompteRequestDTO;
import com.example.msbanqueconnectors.service.CompteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MsBanqueConnectorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBanqueConnectorsApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteService compteService){
        return args -> {
            compteService.saveCompte(new CompteRequestDTO(null,new Date(),Math.random()*20000,"Euro"));
            compteService.saveCompte(new CompteRequestDTO(null,new Date(),Math.random()*20000,"DH"));
            compteService.saveCompte(new CompteRequestDTO(null,new Date(),Math.random()*20000,"Euro"));
            compteService.saveCompte(new CompteRequestDTO(null,new Date(),Math.random()*20000,"DH"));

        };
    }

}

