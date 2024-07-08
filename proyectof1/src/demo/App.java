package demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelos.Driver;
import modelos.Constructors;
import repositorios.DriverRepository;
import repositorios.ConstructorsRepository;

import java.util.Collections;
import java.util.List;

public class App extends Application {

    private DriverRepository driverRepository = new DriverRepository();
    private ConstructorsRepository constructorsRepository = new ConstructorsRepository();

    private ObservableList<Driver> driversData = FXCollections.observableArrayList();
    private ObservableList<Constructors> constructorsData = FXCollections.observableArrayList();

    private TableView<Driver> driverTableView = new TableView<>();
    private TableView<Constructors> constructorsTableView = new TableView<>();

    private ComboBox<Integer> driverYearComboBox = new ComboBox<>();
    private ComboBox<Integer> constructorsYearComboBox = new ComboBox<>();
    private Button driverFilterButton = new Button("Filtrar por Año");
    private Button constructorsFilterButton = new Button("Filtrar por Año");

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Configurar la escena para los conductores
        VBox driverVBox = new VBox();
        driverVBox.getChildren().addAll(driverYearComboBox, driverFilterButton, driverTableView);
        Scene driverScene = new Scene(driverVBox, 800, 600);

        // Configurar la escena para los constructores
        VBox constructorsVBox = new VBox();
        constructorsVBox.getChildren().addAll(constructorsTableView);
        Scene constructorsScene = new Scene(constructorsVBox, 800, 600);

        // Configurar TableView de Drivers
        configureDriversTableView();

        // Configurar TableView de Constructors
        configureConstructorsTableView();

        // Llenar ComboBox con años únicos y ordenados para conductores y constructores
        List<Integer> uniqueDriverYears = driverRepository.getUniqueYears();
        Collections.sort(uniqueDriverYears);
        driverYearComboBox.getItems().addAll(uniqueDriverYears);


        // Configurar eventos para filtrar por año para conductores y constructores
        driverFilterButton.setOnAction(event -> {
            Integer selectedYear = driverYearComboBox.getValue();
            if (selectedYear != null) {
                filterDriversByYear(selectedYear);
            }
        });


        // Mostrar las dos escenas en diferentes Stages
        primaryStage.setScene(driverScene);
        primaryStage.setTitle("Drivers Fórmula 1");
        primaryStage.show();

        Stage constructorsStage = new Stage();
        constructorsStage.setScene(constructorsScene);
        constructorsStage.setTitle("Constructores Fórmula 1");
        constructorsStage.show();
    }

    private void configureDriversTableView() {
        TableColumn<Driver, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("driverId"));

        TableColumn<Driver, String> driverRefColumn = new TableColumn<>("Referencia");
        driverRefColumn.setCellValueFactory(new PropertyValueFactory<>("driverRef"));

        TableColumn<Driver, Integer> numberColumn = new TableColumn<>("Número");
        numberColumn.setCellValueFactory(new PropertyValueFactory<>("number"));

        TableColumn<Driver, String> codeColumn = new TableColumn<>("Código");
        codeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));

        TableColumn<Driver, String> forenameColumn = new TableColumn<>("Nombre");
        forenameColumn.setCellValueFactory(new PropertyValueFactory<>("forename"));

        TableColumn<Driver, String> surnameColumn = new TableColumn<>("Apellido");
        surnameColumn.setCellValueFactory(new PropertyValueFactory<>("surname"));

        TableColumn<Driver, String> nationalityColumn = new TableColumn<>("Nacionalidad");
        nationalityColumn.setCellValueFactory(new PropertyValueFactory<>("nationality"));

        TableColumn<Driver, String> urlColumn = new TableColumn<>("URL");
        urlColumn.setCellValueFactory(new PropertyValueFactory<>("url"));

        driverTableView.getColumns().addAll(idColumn, driverRefColumn, numberColumn, codeColumn, forenameColumn, surnameColumn, nationalityColumn, urlColumn);

        // Cargar datos iniciales de drivers
        driversData.addAll(driverRepository.getAllDrivers());
        driverTableView.setItems(driversData);
    }

    private void configureConstructorsTableView() {
        TableColumn<Constructors, Integer> constructorIdColumn = new TableColumn<>("ID");
        constructorIdColumn.setCellValueFactory(new PropertyValueFactory<>("constructorId"));

        TableColumn<Constructors, String> constructorRefColumn = new TableColumn<>("Referencia");
        constructorRefColumn.setCellValueFactory(new PropertyValueFactory<>("constructorRef"));

        TableColumn<Constructors, String> nameColumn = new TableColumn<>("Nombre");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Constructors, String> constructorNationalityColumn = new TableColumn<>("Nacionalidad");
        constructorNationalityColumn.setCellValueFactory(new PropertyValueFactory<>("nationality"));

        TableColumn<Constructors, String> constructorUrlColumn = new TableColumn<>("URL");
        constructorUrlColumn.setCellValueFactory(new PropertyValueFactory<>("url"));

        constructorsTableView.getColumns().addAll(constructorIdColumn, constructorRefColumn, nameColumn, constructorNationalityColumn, constructorUrlColumn);

        // Cargar datos iniciales de constructores
        constructorsData.addAll(constructorsRepository.getAllConstructors());
        constructorsTableView.setItems(constructorsData);
    }

    private void filterDriversByYear(Integer year) {
        List<Driver> filteredDrivers = driverRepository.getDriversByYear(year);
        driversData.clear();
        driversData.addAll(filteredDrivers);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

