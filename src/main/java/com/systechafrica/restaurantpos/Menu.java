package com.systechafrica.restaurantpos;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> drinks;
    private List<MenuItem> meals;

    public Menu() {
        drinks = new ArrayList<>();
        meals = new ArrayList<>();
    }

    public void addDrink(MenuItem drink) {
        drinks.add(drink);
    }

    public void addMeal(MenuItem meal) {
        meals.add(meal);
    }

    public List<MenuItem> getDrinks() {
        return drinks;
    }

    public List<MenuItem> getMeals() {
        return meals;
    }

}
