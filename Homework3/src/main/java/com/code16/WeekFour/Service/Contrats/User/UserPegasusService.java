package com.code16.WeekFour.Service.Contrats.User;

import com.code16.WeekFour.Entity.Pegasus;

import java.util.List;

public interface UserPegasusService {


    List<Pegasus> getAllPegasus();

    Pegasus getPegasusById(int id);


}
