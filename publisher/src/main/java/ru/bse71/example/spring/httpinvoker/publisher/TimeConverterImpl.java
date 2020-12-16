package ru.bse71.example.spring.httpinvoker.publisher;

import ru.bse71.example.spring.httpinvoker.api.TimeConverter;

public class TimeConverterImpl implements TimeConverter {

    @Override
    public Integer convertToSeconds(Integer hours, Integer minutes) {
        return (hours * 60 + minutes) * 60;
    }
}
