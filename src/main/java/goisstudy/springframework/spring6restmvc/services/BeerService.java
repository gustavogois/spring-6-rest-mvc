package goisstudy.springframework.spring6restmvc.services;

import goisstudy.springframework.spring6restmvc.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
    List<Beer> listBeers();

    Beer saveNewBeer(Beer beer);
}
