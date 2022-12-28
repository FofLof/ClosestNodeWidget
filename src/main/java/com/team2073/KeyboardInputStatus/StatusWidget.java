package com.team2073.KeyboardInputStatus;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.widget.*;
import javafx.scene.layout.Pane;

import java.util.Map;

@Description(name = "Statuses", dataTypes = Status.class, summary = "Status of keyboard inputted commands")
@ParametrizedController("StatusWidget.fxml")
public class StatusWidget extends SimpleAnnotatedWidget<Status> {

    @Override
    public Pane getView() {
        return null;
    }

}
