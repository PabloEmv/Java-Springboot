package com.genspringboot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.genspringboot.project.model.BuySell;
import com.genspringboot.project.service.BuySellService;

public class BuySellController {
    
    private BuySellService buySellService;

    public BuySellController(@Autowired BuySellService buySellService) {
        this.buySellService = buySellService;

    }
    
    @PostMapping("/BuySell/save")
    public void guardarBuySell(@RequestBody BuySell buySell) {
        buySellService.saveBuySell(buySell);
    }
    
    @PutMapping("/BuySell/update")
    public void actualizarBuySell(@RequestBody BuySell buySell) {
        buySellService.updateBuySell(buySell);
    }

    @GetMapping("/BuySell/findAll")
    public List<BuySell> findAll() {
        return buySellService.findAll();
    }

    @DeleteMapping("/BuySell/{id}")
    public void deleteBuySell(@PathVariable Integer id) {
        buySellService.eliminarBuySell(id);
    }

    @GetMapping("/BuySell/buscarMonto")
    public List<BuySell> montoBuySell(@RequestBody Integer monto) {
        return buySellService.buscarPorMonto(monto);
    }

}
