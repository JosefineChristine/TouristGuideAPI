package com.example.turistguide.repository;
import com.example.turistguide.model.TouristAttraction;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public class TouristRepository {
    ArrayList<TouristAttraction> attractions = new ArrayList<>();

    public TouristRepository(){
        populateAttractions();
    }

    public void populateAttractions(){
        attractions.add(new TouristAttraction("Den lille havfrue", "En lille havfrue"));
        attractions.add(new TouristAttraction("Rundetårn", "Et højt rundt tårn"));
        attractions.add(new TouristAttraction("Tivoli", "En forlystelsespark"));
    }

    public ArrayList<TouristAttraction> getAllAttractions(){
        return attractions;
    }

    public TouristAttraction findAttractionByName(String name){
        for (TouristAttraction touristAttraction : attractions){
            if (touristAttraction.getName().equals(name)){
                return touristAttraction;
            }
        }
        return null;
    }

    public TouristAttraction addAttraction(TouristAttraction touristAttraction){
        getAllAttractions().add(touristAttraction);
        return touristAttraction;
    }

    //TODO updateAttraction

    //TODO deleteAttraction


}
