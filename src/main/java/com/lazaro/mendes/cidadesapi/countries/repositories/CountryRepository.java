package com.lazaro.mendes.cidadesapi.countries.repositories;

import com.lazaro.mendes.cidadesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
