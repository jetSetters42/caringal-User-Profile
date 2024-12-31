package com.caringal.activity_userprofile.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepo repository) {
        return args->{
            User Miles = new User(
                    "Miles",
                    "Henry",
                    "Kovach",
                    "milesKovach@mail.com",
                    "miles112233",
                    "Male",
                    "1 street 1 avenue, 1 city",
                    LocalDate.of(2000, 10, 20)
            );

            User Clementine = new User(
                    "Clementine",
                    "May",
                    "Schnider",
                    "clemy2@mail.com",
                    "miles112233",
                    "Male",
                    "1 street 1 avenue, 1 city",
                    LocalDate.of(2000, 10, 20)
            );

            //repository.saveAll(List.of(Miles, Clementine));
        };
    }
}
