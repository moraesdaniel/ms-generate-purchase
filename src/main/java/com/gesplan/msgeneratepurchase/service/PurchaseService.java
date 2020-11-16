package com.gesplan.msgeneratepurchase.service;

import java.util.Date;

public interface PurchaseService {
    long getQtdItems();
    double getTotalValue();
    Date getDate();
}
