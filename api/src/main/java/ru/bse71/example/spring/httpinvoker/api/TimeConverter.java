package ru.bse71.example.spring.httpinvoker.api;

public interface TimeConverter {

    Integer convertToSeconds(Integer hours, Integer minutes);
}
