package com.example.myapp.services;

import com.example.myapp.models.Stock;
import com.example.myapp.models.User;
import com.example.myapp.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
  @Autowired
  StockRepository stockRepository;


  public int saveStock(User user, Stock stock) {
    stock.setUser(user);
    stockRepository.save(stock);
    return 1;
  }

  public int deleteStock(User user, String symbol) {
    stockRepository.delete(stockRepository.findByUserAndSymbol(user, symbol));
    return 1;
  }
}
