package com.code16.WeekFour.Service.Contrats.Admin;

import com.code16.WeekFour.Entity.Thy;


public interface AdminTHYService {
    void addTHY(Thy thy);

    void updateTHY(Thy thy);


    void deleteTHY(int id);
}
