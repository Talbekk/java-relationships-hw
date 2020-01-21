package com.codeclan.example.fileservice.components;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.repositories.FileRepository;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import com.codeclan.example.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){

        User user = new User("James");
        userRepository.save(user);

        Folder folder = new Folder("Complete Readings", user);
        folderRepository.save(folder);

        File file = new File("Reading", ".docx", 25, folder);
        fileRepository.save(file);



    }

//    Ship dutchman = new Ship("The Flying Dutchman");
//        shipRepository.save(dutchman);
//    Ship pearl = new Ship("The Black Pearl");
//        shipRepository.save(pearl);
//    Pirate jack = new Pirate("Jack", "sparrow", 32, pearl);
//        pirateRepository.save(jack);
//    Pirate john = new Pirate("John", "Silver", 55, dutchman);
//        pirateRepository.save(john);
//    Raid raid1 = new Raid("Tortuga", 100);
//        raidRepository.save(raid1);
//    Raid raid2 = new Raid("Treasure Island", 690);
//        raidRepository.save(raid2);
//        jack.addRaid(raid1);
//        jack.addRaid(raid2);
//        pirateRepository.save(jack);
//        raid2.addPirate(john);
//        raidRepository.save(raid2);

}
