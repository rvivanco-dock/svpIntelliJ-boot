package com.telcel.jtx.controllers;

import com.telcel.jtx.models.*;
import com.telcel.jtx.repositories.*;
import com.telcel.jtx.request.SearchServiceByType;
import com.telcel.jtx.request.ServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/")
public class Controller {

    /*  DECLARIONES DE AUTOWIRED PARA EVITAR EL USO DE NEW
     */
    @Autowired
    private ServiceJtxRepository serviceJtxRepository;
    @Autowired
    private RulesContainsRepository rulesContainsRepository;
    @Autowired
    private RulesDependencyRepository rulesDependencyRepository;
    @Autowired
    private RulesLengthRepository rulesLengthRepository;
    @Autowired
    private RulesServiceRepository rulesServiceRepository;


    /**
     * Metodo para listar de la tabla services
     * @return Lista de servicios
     */

    @RequestMapping("/services")
    public List<ServicesJtxModel> getServices() {
        return serviceJtxRepository.findByName("FX");

    }
    @RequestMapping("/servicesAll")
    public List<ServicesJtxModel> getServicesAll() {

        return serviceJtxRepository.findAll();

    }

    @RequestMapping("/rulesContains")
    public List<RulesContainsModel> getRulesContains() {
        System.out.println("ñañañaañ");
        return rulesContainsRepository.findAll();

    }

    @RequestMapping("/rulesDependency")
    public List<RulesDependencyModel> getRulesDependency() {
       return rulesDependencyRepository.findAll();

    }

    @RequestMapping("/rulesLength")
    public List<RulesLengthModel> getRulesLength() {
        return rulesLengthRepository.findAll();

    }

    @RequestMapping("/rulesService")
    public  List<RulesOfServiceModel> getRulesService(){
        return rulesServiceRepository.findAll();
    }


    @RequestMapping("/findServiceByType")
    public List<ServicesJtxModel> findServiceByType(@RequestParam(name = "type")Long type) {
        return serviceJtxRepository.findByType(type);

    }

    /**
     * Metodo para crear un servicio a la tabla de servicios
     * @param servicesJtxModel
     * @return
     */
    @PostMapping("/createService")
    public ServicesJtxModel createService(@RequestBody ServicesJtxModel servicesJtxModel){
        return serviceJtxRepository.save(servicesJtxModel);
    }

    @PostMapping("/createRuleLength")
    public RulesLengthModel createService(@RequestBody RulesLengthModel rulesLengthModel){
        return rulesLengthRepository.save(rulesLengthModel);
    }
}

