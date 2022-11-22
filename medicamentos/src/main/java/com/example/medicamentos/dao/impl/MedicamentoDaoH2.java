package com.example.medicamentos.dao.impl;

import com.example.medicamentos.dao.ConfiguracionJDBC;
import com.example.medicamentos.dao.IDao;
import com.example.medicamentos.model.Medicamento;

import java.util.logging.Logger;

public class MedicamentoDaoH2 implements IDao<Medicamento> {

    private ConfiguracionJDBC configuracionJDBC;
    final static Logger log = Logger.getLogger(MedicamentoDaoH2.class);

    public MedicamentoDaoH2(ConfiguracionJDBC configuracionJDBC) {
        this.configuracionJDBC = configuracionJDBC;
    }

    @Override


}
