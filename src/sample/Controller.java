package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {

   @FXML
    TextArea txt1;

    @FXML
    TextArea txt2;

    @FXML
    TextArea txt3;

    @FXML
    Button but1;

    String dni="";
    String codigo="";
    String pin="";
    boolean booleano1=false;
    boolean booleano2=false;
    boolean booleano3=false;

    //Para que el boton se habilite, hay que quitar el cursor del ultimo TextArea

    @FXML
    public void contenidoTxt1(){

      dni=txt1.getText();
      booleano1= dni.equals("1234567B");
      if(booleano1)
        accederBoton();

    }

@FXML
 public void contenidoTxt2(){

      codigo=txt2.getText();
      booleano2= codigo.equals("ABCD");
      if(booleano2)
        accederBoton();
    }

    @FXML
    public void contenidoTxt3(){

      pin=txt3.getText();
      booleano3= pin.equals("123");
      if(booleano3)
        accederBoton();
    }

    @FXML
    public void accederBoton() {

     if(booleano1 && booleano2 && booleano3)
      but1.setDisable(false);

    }



}
