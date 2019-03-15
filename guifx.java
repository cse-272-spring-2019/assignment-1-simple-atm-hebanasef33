import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;



public class guifx extends Application {
    Stage Window1 ;
    int temp ;
    logic obj = new logic() ;
    public-
    @Override
    public void start(Stage primaryStage) throws Exception {
        Window1 = primaryStage;
        Scene scn,scn1,scn2,scn4 ;


        TextField txt1 = new TextField();
        Label lab7 = new Label();

        Button btn1 = new Button("0");
        btn1.setOnAction(event -> txt1.setText(txt1.getText() + "0"));
        Button btn2 = new Button("1");
        btn2.setOnAction(event -> txt1.setText(txt1.getText() + "1"));
        Button btn3 = new Button("2");
        btn3.setOnAction(event -> txt1.setText(txt1.getText() + "2"));
        Button btn4 = new Button("3");
        btn4.setOnAction(event -> txt1.setText(txt1.getText() + "3"));
        Button btn5 = new Button("4");
        btn5.setOnAction(event -> txt1.setText(txt1.getText() + "4"));
        Button btn6 = new Button("5");
        btn6.setOnAction(event -> txt1.setText(txt1.getText() + "5"));
        Button btn7 = new Button("6");
        btn7.setOnAction(event -> txt1.setText(txt1.getText() + "6"));
        Button btn8 = new Button("7");
        btn8.setOnAction(event -> txt1.setText(txt1.getText() + "7"));
        Button btn9 = new Button("8");
        btn9.setOnAction(event -> txt1.setText(txt1.getText() + "8"));
        Button btn10 = new Button("9");
        btn10.setOnAction(event -> txt1.setText(txt1.getText() + "9"));
        Button btn11 = new Button("enter");
        Button btn50 = new Button("clear");


        Label lab = new Label("user name :");


        GridPane grid = new GridPane();

        grid.add(lab, 0, 0);
        grid.add(lab7, 0, 6);
        grid.add(txt1, 2, 0);
        grid.add(btn1, 6, 1);
        grid.add(btn2, 5, 2);
        grid.add(btn3, 6, 2);
        grid.add(btn4, 7, 2);
        grid.add(btn5, 5, 3);
        grid.add(btn6, 6, 3);
        grid.add(btn7, 7, 3);
        grid.add(btn8, 5, 4);
        grid.add(btn9, 6, 4);
        grid.add(btn10, 7, 4);
        grid.add(btn11, 8, 5);
        grid.add(btn50, 8, 6);


        scn = new Scene(grid, 500, 300);




        Button btn12 = new Button("1) Deposit");
        Button btn13 = new Button("1) Withdraw");
        Button btn14 = new Button("1) balance");
        Button btn30 = new Button("show next transaction");
        Button btn31 = new Button("show previous transaction");
        Label lab2 = new Label("ur bal :");
        Label lab3 = new Label();
        Label lab4 = new Label();

        GridPane grid1 = new GridPane();


        grid1.add(btn12, 0, 0);
        grid1.add(btn13, 1, 0);
        grid1.add(btn14, 2, 0);
        grid1.add(lab2, 2, 1);
        grid1.add(lab3, 3, 1);
        grid1.add(btn30, 0, 2);
        grid1.add(btn31, 1, 2);
        grid1.add(lab4, 0, 3);



        scn1 = new Scene(grid1, 700, 300);




        GridPane grid2 = new GridPane();


        Label lab1 = new Label("enter amount :");
        Label lab10 = new Label();
        TextField txt2 = new TextField();
        Button btn15 = new Button("0");
        btn15.setOnAction(event -> txt2.setText(txt2.getText() + "0"));
        Button btn16 = new Button("1");
        btn16.setOnAction(event -> txt2.setText(txt2.getText() + "1"));
        Button btn17 = new Button("2");
        btn17.setOnAction(event -> txt2.setText(txt2.getText() + "2"));
        Button btn18 = new Button("3");
        btn18.setOnAction(event -> txt2.setText(txt2.getText() + "3"));
        Button btn19 = new Button("4");
        btn19.setOnAction(event -> txt2.setText(txt2.getText() + "4"));
        Button btn20 = new Button("5");
        btn20.setOnAction(event -> txt2.setText(txt2.getText() + "5"));
        Button btn21 = new Button("6");
        btn21.setOnAction(event -> txt2.setText(txt2.getText() + "6"));
        Button btn22 = new Button("7");
        btn22.setOnAction(event -> txt2.setText(txt2.getText() + "7"));
        Button btn23 = new Button("8");
        btn23.setOnAction(event -> txt2.setText(txt2.getText() + "8"));
        Button btn24 = new Button("9");
        btn24.setOnAction(event -> txt2.setText(txt2.getText() + "9"));
        Button btn25 = new Button("enter");
        Button btn26=new Button("home");
        Button btn60 = new Button("clear");
        btn26.setOnAction(event -> Window1.setScene(scn1));

        grid2.add(lab1, 0, 0);
        grid2.add(btn15, 6, 1);
        grid2.add(btn16, 5, 2);
        grid2.add(btn17, 6, 2);
        grid2.add(btn18, 7, 2);
        grid2.add(btn19, 5, 3);
        grid2.add(btn20, 6, 3);
        grid2.add(btn21, 7, 3);
        grid2.add(btn22, 5, 4);
        grid2.add(btn23, 6, 4);
        grid2.add(btn24, 7, 4);
        grid2.add(btn25, 8, 5);
        grid2.add(btn26, 8, 6);
        grid2.add(txt2, 0, 8);
        grid2.add(lab10, 0, 9);
        grid2.add(btn60, 8, 7);

        scn2 = new Scene(grid2, 700, 300);




        TextField txt3 = new TextField();

        Label lab9 = new Label();
        Button btn35 = new Button("0");
        btn35.setOnAction(event -> txt3.setText(txt3.getText() + "0"));
        Button btn36 = new Button("1");
        btn36.setOnAction(event -> txt3.setText(txt3.getText() + "1"));
        Button btn37 = new Button("2");
        btn37.setOnAction(event -> txt3.setText(txt3.getText() + "2"));
        Button btn38 = new Button("3");
        btn38.setOnAction(event -> txt3.setText(txt3.getText() + "3"));
        Button btn39 = new Button("4");
        btn39.setOnAction(event -> txt3.setText(txt3.getText() + "4"));
        Button btn40 = new Button("5");
        btn40.setOnAction(event -> txt3.setText(txt3.getText() + "5"));
        Button btn41 = new Button("6");
        btn41.setOnAction(event -> txt3.setText(txt3.getText() + "6"));
        Button btn42= new Button("7");
        btn42.setOnAction(event -> txt3.setText(txt3.getText() + "7"));
        Button btn43= new Button("8");
        btn43.setOnAction(event -> txt3.setText(txt3.getText() + "8"));
        Button btn44 = new Button("9");
        btn44.setOnAction(event -> txt3.setText(txt3.getText() + "9"));
        Button btn45 = new Button("enter");
        Button btn55 = new Button("home");
        Button btn70 = new Button("clear");



        GridPane grid4 = new GridPane();


        grid4.add(txt3, 2, 0);
        grid4.add(btn35, 6, 1);
        grid4.add(btn36, 5, 2);
        grid4.add(btn37, 6, 2);
        grid4.add(btn38, 7, 2);
        grid4.add(btn39, 5, 3);
        grid4.add(btn40, 6, 3);
        grid4.add(btn41, 7, 3);
        grid4.add(btn42, 5, 4);
        grid4.add(btn43, 6, 4);
        grid4.add(btn44, 7, 5);
        grid4.add(btn45, 7, 6);
        grid4.add(lab9,0,9);
        grid4.add(btn55,7,7);
        grid4.add(btn70,7,8);


        scn4 = new Scene(grid4, 700, 300);



        btn12.setOnAction(event -> Window1.setScene(scn2));
        btn13.setOnAction(event -> Window1.setScene(scn4));
        btn26.setOnAction(event -> Window1.setScene(scn1));
        btn55.setOnAction(event -> Window1.setScene(scn1));
        btn31.setOnAction(event ->{
            int c =obj.func1() ;
            if(obj.getCounter()<0||c<(temp-5))
                lab4.setText("no previous trans");
            else
                lab4.setText(mystring2[c]);
        });

        btn30.setOnAction(event ->{
            int c =obj.func2() ;
            if(c>temp )
            {
                lab4.setText("no next transaction");

            }
            else

                lab4.setText(mystring2[c]);

        });
        btn11.setOnAction(event -> {
            if (Integer.parseInt(txt1.getText()) == 1234)
                Window1.setScene(scn1) ;

            else
                lab7.setText("wrong card number ");
        });
        btn50.setOnAction(event ->txt1.setText(""));
        btn60.setOnAction(event ->txt2.setText(""));
        btn70.setOnAction(event ->txt3.setText(""));

        btn25.setOnAction(event ->{
            int a =Integer.parseInt(txt2.getText());

            obj.deposit(a);
            lab10.setText("amount have been deposited successfully ");
            temp =obj.getCounter();
        });
        btn45.setOnAction(event ->{
            int a =Integer.parseInt(txt3.getText());

            int b = obj.withdraw(a);
            if(b==0)
                lab9.setText("no enough balance " );
            else
                lab9.setText("amount have been deposited successfully " );
            temp =obj.getCounter();
        });
        btn14.setOnAction(event ->{  lab3.setText(Integer.toString(obj.balance));
            obj.balance();
        });
        Window1.setScene(scn);
        Window1.show();
    }
}