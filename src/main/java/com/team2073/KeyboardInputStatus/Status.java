package com.team2073.KeyboardInputStatus;

import edu.wpi.first.shuffleboard.api.data.ComplexData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

@Getter
public final class Status extends ComplexData<Status> {

    private String[] statuses;

    public Status(String[] statuses) {
        this.statuses = statuses;
    }

    @Override
    public Map<String, Object> asMap() {

        return Map.of("status", statuses);
    }

    public ObservableList<String> getCollections() {
        ObservableList<String> collections = FXCollections.observableArrayList();
        collections.addAll(Arrays.asList(statuses));
        if (collections.size() == 0) {
            collections.add("No Keyboard Input");
        }
        return collections;
    }

    @Override
    public String toHumanReadableString() {
        return statuses.length + " statuses";
    }
}
