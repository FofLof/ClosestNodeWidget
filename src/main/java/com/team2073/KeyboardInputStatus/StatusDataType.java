package com.team2073.KeyboardInputStatus;

import edu.wpi.first.shuffleboard.api.data.ComplexDataType;

import java.util.Map;
import java.util.function.Function;

public class StatusDataType extends ComplexDataType<Status> {

    private static final String TYPE_NAME = "Status";

    public static final StatusDataType instance = new StatusDataType();

    public StatusDataType() {
        super(TYPE_NAME, Status.class);
    }

    @Override
    public Function<Map<String, Object>, Status> fromMap() {
        return map -> new Status((String[]) map.getOrDefault("status", new String[] {}));
    }

    @Override
    public Status getDefaultValue() {
        return new Status();
    }
}
