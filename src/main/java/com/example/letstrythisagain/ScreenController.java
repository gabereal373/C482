package com.example.letstrythisagain;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class
ScreenController {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToAddPartInHouse(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("add-part-in-house.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAddPartOutSourced(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("add-part-out-sourced.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToModifyPartInHouse(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("modify-part-in-house.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToModifyPartOutSourced(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("modify-part-out-sourced.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToHome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onHelloButtonClick() {

    }
}