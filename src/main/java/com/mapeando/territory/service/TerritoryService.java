package com.mapeando.territory.service;

import com.mapeando.territory.entity.Territory;
import com.mapeando.territory.repository.TerritoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TerritoryService {

    @Autowired
    TerritoryRepository territoryRepository;
    public Territory createTerritory(Territory territory) {
        return territoryRepository.save(territory);
    }

    public Optional<Territory> getTerritoryById(String id) {
        return territoryRepository.findById(id);
    }

    public List<Territory> getAllTerrytories() {
        return territoryRepository.findAll();
    }

    public Territory updateTerritory(Territory territory) {
        return territoryRepository.save(territory);
    }

    public HttpStatus deleteTerritory(String id) {
        try{
            territoryRepository.deleteById(id);
            return HttpStatus.OK;
        }catch (Exception ex){
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }

    }
}
