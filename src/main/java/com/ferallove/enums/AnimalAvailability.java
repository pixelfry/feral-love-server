package com.ferallove.enums;

import lombok.Getter;

@Getter
public enum AnimalAvailability {
    AVAILABLE("available"),
    ADOPTED("adopted"),
    PENDING("pending");

    private String value;

    AnimalAvailability(String value) {
        this.value = value;
    }

    // Method to convert database string to enum
    public static AnimalAvailability fromValue(String value) {
        for (AnimalAvailability status : AnimalAvailability.values()) {
            if (status.getValue().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown enum type: " + value);
    }
}
