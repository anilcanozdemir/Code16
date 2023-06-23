package com.code16.WeekFour.Service.Contrats.Admin;

import com.code16.WeekFour.Entity.Pegasus;


public interface AdminPegasusService {
    void addPegasus(Pegasus pegasus);

    void updatePegasus(Pegasus pegasus);


    void deletePegasus(int id);
}
