package com.horseapp.data;

import com.horseapp.model.Horse;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class HorseRepository {
    // list of Horse objects
    private static final List<Horse> horseList = Arrays.asList(

            new Horse("Irish-War-Cry", "noted for his win in the Wood Memorial Stakes"),
            new Horse("Shergar", "winner of the 1981 Epsom Derby by a record 10 lengths"),
            new Horse("Galileo", " best known for winning The Derby"),
            new Horse("Adios", "The son of Hal Dale and the mare Adioo Volo"),
            new Horse("Moifaa", "First New Zealand horse to win the Grand National"),
            new Horse("Affirmed", "eleventh winner of the US Triple Crown"),
            new Horse("Chrisp", "He was foaled in 1963 in Australia"),
            new Horse("Barbaro", "Decisively won the 2006 Kentucky Derby"),
            new Horse("Buckpasser", "Won 9 of his 11 race starts"),
            new Horse("Flyingbolt", "Considered as the 2nd best Steeplechaser ever.")


    );

    //get an Horse from the list based in the filename which is the same as the Horse name
    public Horse findHorseFileName(String fileName) {
        for (Horse horse : horseList) {
            if (horse.getHorseFileName().equals(fileName)) {
                return horse;
            }
        }
        return null;
    }
    public List<Horse> listOfHorses(){
        return horseList;
    }
}
