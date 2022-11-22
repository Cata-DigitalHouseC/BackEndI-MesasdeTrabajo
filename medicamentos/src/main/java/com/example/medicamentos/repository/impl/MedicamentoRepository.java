package com.example.medicamentos.repository.impl;

import com.example.medicamentos.dto.MedicamentoDTO;
import com.example.medicamentos.repository.IRepositoryRest;
import com.example.medicamentos.util.Jsons;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import java.net.http.HttpResponse;


public class MedicamentoRepository implements IRepositoryRest<MedicamentoDTO> {

    @Override
    public MedicamentoDTO guardar(MedicamentoDTO medicamentoDTO) {
        HttpResponse<String> response = null;
        MedicamentoDTO medicamento = null;
        try {
            response = Unirest.post("http://localhost:8080/medicamentos/registrar")
                    .body(Jsons.asJsonString(medicamentoDTO)).asString();
            medicamento = Jsons.objectFromString(MedicamentoDTO.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return medicamento;
    }

    @Override
    public MedicamentoDTO actualizar(MedicamentoDTO medicamentoDTO) {
        HttpResponse<String> response = null;
        MedicamentoDTO medicamento = null;
        try {
            response = Unirest.put("http://localhost:8080/medicamentos/actualizar")
                    .body(Jsons.asJsonString(medicamentoDTO)).asString();
            medicamento = Jsons.objectFromString(MedicamentoDTO.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return medicamento;
    }

    @Override
    public String eliminar(Integer id) {
        HttpResponse<String> response = null;
        try {
            response = Unirest.post("http://localhost:8080/medicamentos/"+id).asString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return response != null ? String.valueOf(response.getStatus()) : null;
    }

    @Override
    public MedicamentoDTO buscar(Integer id) {
        HttpResponse<String> response = null;
        MedicamentoDTO medicamento = null;
        try {
            response = Unirest.get("http://localhost:8080/medicamentos/" + id).asString();
            medicamento = Json.objectFromString(MedicamentoDTO.class, response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medicamento;
    }
}
