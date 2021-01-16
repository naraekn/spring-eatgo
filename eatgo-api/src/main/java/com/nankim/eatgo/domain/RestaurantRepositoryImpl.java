package com.nankim.eatgo.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {
    private List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantRepositoryImpl() {
        restaurants.add(new Restaurant(1004L, "Bob zip", "Yongin"));
        restaurants.add(new Restaurant(2020L, "Cyber Food", "Yongin"));
    }

    @Override
    public List<Restaurant> findAll() {
        return restaurants;
    }

    @Override
    public Restaurant findById(Long id) {
        return restaurants.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
