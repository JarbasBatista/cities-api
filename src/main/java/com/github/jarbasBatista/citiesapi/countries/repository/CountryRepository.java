package com.github.jarbasBatista.citiesapi.countries.repository;

import com.github.jarbasBatista.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
