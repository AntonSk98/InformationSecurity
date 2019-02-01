package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.print.attribute.IntegerSyntax;

public class Controller {
    private String Stext1;
    private Integer Stext2;
    @FXML
    private Button button;
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;



    @FXML
    void initialize(){
        button.setOnAction(event -> {
            Stext1 = text1.getText();
            Stext2 = Integer.parseInt(text2.getText());
            if (text1.getText().isEmpty() || text2.getText().isEmpty()){
                Alert alert1 = new Alert(Alert.AlertType.ERROR);
                alert1.setTitle("Ошибка!");
                alert1.setContentText("Заполните поля!!");
                alert1.setHeaderText("Ошибка!");
                alert1.showAndWait();
            }

            if(CheckString.checkString(Stext1)){
                Alert alert1 = new Alert(Alert.AlertType.ERROR);
                alert1.setTitle("Ошибка!");
                alert1.setContentText("Введите без использования слежебных символов!!");
                alert1.setHeaderText("Ошибка!");
                alert1.showAndWait();
            }
            else{
            String chipher = CaesarEncrypt.encrypt(Stext1, Stext2);
            String decrypt = CaesarDecrypt.decrypt(chipher,Stext2);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Результаты");
            alert.setContentText("Шифрование "+chipher+"\nИсходный текс "+decrypt);
            alert.setHeaderText("Шифр Цезаря");
            alert.showAndWait();
            System.out.println(Stext1);}

        });



    }

}
