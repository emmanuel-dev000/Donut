package com.pangan.project.donut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonutService {

    @Autowired
    private DonutRepository _donutRepository;

    public List<Donut> getAllDonuts() {
        return _donutRepository.findAll();
    }

    public Donut getDonutById(String donutId) {
        Optional<Donut> result = _donutRepository.findById(donutId);
        if (result.isEmpty()) {
            return null;
        }

        return result.get();
    }

    public Donut addNewDonut(Donut newDonut) {
        return _donutRepository.save(newDonut);
    }

    public Donut updateDonutById(Donut updatedDonut, String donutId) {
        Optional<Donut> searchedDonut = _donutRepository.findById(donutId);
        if (searchedDonut.isEmpty()) {
            return null;
        }

        Donut donut = searchedDonut.get();
        donut.setName(updatedDonut.getName());
        Donut savedDonut = _donutRepository.save(donut);
        return savedDonut;
    }

    public String deleteDonutById(String donutId) {
        Optional<Donut> searchedDonut = _donutRepository.findById(donutId);
        if (searchedDonut.isEmpty()) {
            return null;
        }

        Donut donut = searchedDonut.get();
        _donutRepository.delete(donut);
        return "DONUT DELETED!";
    }
}
