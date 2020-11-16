package com.gesplan.msgeneratepurchase.service;

import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Override
    public long getQtdItems() {
        Random random = new Random();
        int qtdItems = 0;

        while (qtdItems == 0) {
            qtdItems = random.nextInt(50);
        }

        return qtdItems;
    }

    @Override
    public double getTotalValue() {
        Random random = new Random();
        double totalValue = 0;

        while(totalValue < 10) {
            totalValue = random.nextDouble() * 100;
        }

        totalValue = Math.round(totalValue * 100.0) / 100.0;

        return totalValue;
    }

    @Override
    public Date getDate() {
        Random random = new Random();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, random.nextInt(7));

        return calendar.getTime();
    }
}
