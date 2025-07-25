package com.example.spring.twosumapp.Controller;

import com.example.spring.twosumapp.DTO.TwoSumApp;
import com.example.spring.twosumapp.Service.TwoSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/controller")
public class TwoSumController {
    //Controller, Service’in iş mantığını kullanacak. Bağımlılık (dependency injection).

    @Autowired
    private TwoSumService twoSumService;

    @PostMapping("/twosum")
    public int[] twosumApp(@RequestBody TwoSumApp twoSumApp) {
        return twoSumService.twoSum(twoSumApp.getNums(), twoSumApp.getTarget());
    }
}
