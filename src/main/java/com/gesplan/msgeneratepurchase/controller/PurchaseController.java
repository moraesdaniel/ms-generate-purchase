package com.gesplan.msgeneratepurchase.controller;

import com.gesplan.msgeneratepurchase.domain.Client;
import com.gesplan.msgeneratepurchase.domain.Purchase;
import com.gesplan.msgeneratepurchase.service.ClientService;
import com.gesplan.msgeneratepurchase.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/compras")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private ClientService clientService;

    @GetMapping("/{qtdPurchases}")
    @ResponseBody
    public List<Purchase> getPurchase(@PathVariable("qtdPurchases") long qtdPurchases) {
        List<Purchase> purchases = new ArrayList<>();
        Client client = clientService.getRandomClient();

        for(int purchaseIndex = 1; purchaseIndex <= qtdPurchases; purchaseIndex++) {
            purchases.add(new Purchase(client, purchaseService.getTotalValue(),
                    purchaseService.getDate(), purchaseService.getQtdItems()));
        }

        return purchases;
    }
}
