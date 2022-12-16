package com.genspringboot.project.service;

import java.util.List;

import com.genspringboot.project.model.BuySell;
import com.genspringboot.project.repository.BuySellRepository;

public class BuySellService {
    
    private BuySellRepository buySellRepository;

    public BuySellService(BuySellRepository buySellRepository) {
        this.buySellRepository = buySellRepository;
    }

    public void saveBuySell(BuySell buySell) {
        buySellRepository.save(buySell);
    }

    public void updateBuySell(BuySell buySell) {
        buySellRepository.save(buySell);
    }

    public List<BuySell> findAll() {
        return buySellRepository.findAll();

    }

    public void eliminarBuySell(Integer id) {
        buySellRepository.deleteById(id);
    }

    public List<BuySell> buscarPorMonto(Integer monto) {
        return buySellRepository.findAllBuySellMonto(monto);
    }
    
}
