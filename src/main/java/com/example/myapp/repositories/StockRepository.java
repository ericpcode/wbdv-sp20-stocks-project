package com.example.myapp.repositories;

import com.example.myapp.models.Stock;
import com.example.myapp.models.User;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository
        extends CrudRepository<Stock, Integer> {
  public int removeByUserAndSymbol(User user, String symbol);
}
