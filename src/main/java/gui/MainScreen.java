package gui;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainScreen {

    private GridPane grid;

    MainScreen() {
        grid = new GridPane();
    }

    public void create() {
        var table = new TableView<String>();
        table.setEditable(false);
        table.getColumns().addAll(getTableColumns("№ Part", "What's happened", "Spent time"));
    }

    private List<TableColumn<String, String>> getTableColumns(String... columnsNames) {
        return Arrays
                .stream(columnsNames)
                .map((Function<String, TableColumn<String, String>>) TableColumn::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public GridPane getGrid() {
        return grid;
    }
}
