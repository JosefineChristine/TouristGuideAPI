package com.example.turistguide.service;

import com.example.turistguide.model.TouristAttraction;
import com.example.turistguide.repository.TouristRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@Service
public class TouristService {

    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository){
        this.touristRepository = touristRepository;
    }

    public ArrayList<TouristAttraction> getAllAttractions(){
        return touristRepository.getAllAttractions();
    }

    public TouristAttraction findAttractionByName(String name) {
        return touristRepository.findAttractionByName(name);
    }

    public TouristAttraction addAttraction(TouristAttraction touristAttraction){
        return touristRepository.addAttraction(touristAttraction);
    }

    public TouristAttraction updateAttraction(String searchName, TouristAttraction touristAttraction){
        return touristRepository.updateAttraction(searchName, touristAttraction);
    }

    public void removeAttraction(String seachName){
        touristRepository.removeAttraction(seachName);
    }


}
