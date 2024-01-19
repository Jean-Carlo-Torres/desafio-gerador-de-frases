package com.webapp.screenmatchfrase.service;

import com.webapp.screenmatchfrase.dto.FraseDTO;
import com.webapp.screenmatchfrase.models.Frase;
import com.webapp.screenmatchfrase.repository.FraseReposirory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseReposirory repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
