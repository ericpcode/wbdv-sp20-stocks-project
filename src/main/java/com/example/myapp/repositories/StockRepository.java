package com.example.myapp.repositories;

import com.example.myapp.models.Stock;
import com.example.myapp.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StockRepository
        extends CrudRepository<Stock, Integer> {
  @Query("SELECT stock FROM Stock stock WHERE stock.user=:user AND stock.symbol=:symbol")
  public Stock findByUserAndSymbol(@Param("user") User user, @Param("symbol") String symbol);
}