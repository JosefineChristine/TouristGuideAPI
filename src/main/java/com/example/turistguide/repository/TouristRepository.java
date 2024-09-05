package com.example.turistguide.repository;

import com.example.turistguide.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private List<TouristAttraction> attractions;

    public TouristRepository(){
        attractions = new ArrayList<>();
    }

    //TODO opret et par TouristAttraction objekter, som tilføjes til denne ArrayList

    //TODO Klassen skal desuden indeholde CRUD metoder,
    // der arbejder på ovenstående ArrayList. Vent evt med
    // den endelige metodesignatur for CRUD metoderne til I
    // har set beksrivelsen af Controller klassens endpoints
    // nedenfor.




}
