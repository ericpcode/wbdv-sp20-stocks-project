package com.example.myapp.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  private String password;
  @OneToMany(mappedBy = "user")
  private List<Stock> stocks;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Stock> getStocks() {
    return stocks;
  }

  public void setStocks(List<Stock> stocks) {
    this.stocks = stocks;
  }
}
