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

        Person person2 = new Person("Angie");
        personRepository.save(person2);

        Folder folder1 = new Folder("Codeclan1", person1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Codeclan2", person2);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Codeclan3", person2);
        folderRepository.save(folder3);
    }
}
