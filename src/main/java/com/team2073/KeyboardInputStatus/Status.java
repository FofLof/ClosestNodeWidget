package com.team2073.KeyboardInputStatus;

import edu.wpi.first.shuffleboard.api.data.ComplexData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Status extends ComplexData<Status> {

    private String[] statuses;

    @Override
    public Map<String, Object> asMap() {

        return Map.of("status", statuses);
    }

    public ObservableList<String> getCollections() {
        ObservableList<String> collections = FXCollections.observableArrayList();
        for (String status : statuses) {
            collections.add(status);
        }
        return collections;
    }

}
