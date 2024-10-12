package com.example.demo.services;

import com.example.demo.models.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrderService {
    public void saveOrder(List<Producto> productos);
}
