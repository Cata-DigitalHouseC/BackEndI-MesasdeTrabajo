package com.example.medicamentos.service;

import com.example.medicamentos.dto.MedicamentoDTO;
import com.example.medicamentos.repository.IRepositoryRest;

public class medicamentoService {

    private IRepositoryRest<MedicamentoDTO> medicamentoRepository;

    public MedicamentoService(IRepositoryRest<MedicamentoDTO> medicamentoRepository) {
        this.medicamentoRepository = medicamentoRepository;
    }

    public MedicamentoDTO guardarMedicamento(MedicamentoDTO medicamento) {
        return medicamentoRepository.guardar(medicamento);
    }

    public MedicamentoDTO actualizarMedicamento(MedicamentoDTO medicamento) {
        return medicamentoRepository.actualizar(medicamento);
    }

    public String eliminarMedicamento(Integer id) {
        medicamentoRepository.eliminar(id);
    }

    public MedicamentoDTO obtenerMedicamentos(Integer id) {
        return medicamentoRepository.buscar(id);
    }
}
