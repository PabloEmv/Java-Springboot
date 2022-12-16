package com.genspringboot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.genspringboot.project.model.License;
import com.genspringboot.project.service.LicenseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class LicenseController {
    
    private LicenseService licenseService;

    public LicenseController(@Autowired LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @PostMapping("/License/save")
        public void guardarLicencia (@RequestBody License license) {
            licenseService.saveLicense(license);
        }

    @PutMapping("/License/update")
    public void actualizarLicencia (@RequestBody License license) {
        licenseService.updateLicense(license);

    }

    @GetMapping("/License/findAll")
    public List<License> findAll() {
        return licenseService.findAll();
    }
    
    @DeleteMapping("/License/eliminarLicencia/{id}")
    public void deleteLicencia(@PathVariable Integer id) {
        licenseService.eliminarLicencia(id);
    }

    @GetMapping("/License/buscarClaseLicencia")
    public List<License> claseLicencia(@RequestBody String clase) {
        return licenseService.buscarPorClaseLicencia(clase);
    }
}
