package com.ferallove.utils;
import com.ferallove.enums.AnimalAvailability;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.stereotype.Component;

@Component
@Converter(autoApply = true)
public class AnimalAvailabilityConverter implements AttributeConverter<AnimalAvailability, String>  {
    @Override
    public String convertToDatabaseColumn(AnimalAvailability animalAvailability) {
        if (animalAvailability == null) {
            return null;
        }
        return animalAvailability.getValue();

    }

    @Override
    public AnimalAvailability convertToEntityAttribute(String value) {
        if (value == null) {
            return null;
        }
        return AnimalAvailability.fromValue(value.toLowerCase());
    }
}
