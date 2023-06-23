package com.code16.WeekFour.Service.Contrats.User;

import com.code16.WeekFour.Entity.Thy;

import java.util.List;

public interface UserTHYService {


    List<Thy> getAllTHY();

    Thy getTHYById(int id);


}
