package com.codeclan.example.fileservice.components;

import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.Person;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import com.codeclan.example.fileservice.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Override
    public void run(ApplicationArguments args) {

        Person person1 = new Person("Tommy");
        personRepository.save(person1);

        Folder folder1 = new Folder("Codeclan", person1);
        folderRepository.save(folder1);

    }
}
