package com.example.palindrome;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.*;
import java.util.Stack;
import java.util.Queue;
import  java.lang.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField str;

    @FXML
    protected void onHelloButtonClick() {

        String item = str.getText();
        //Convert item to lowercase
        String itemLower = item.toLowerCase();

        // Copying character by character into array
        char[] ch = itemLower.toCharArray();

        //Push each character to a stack
        Stack <String> text = new  Stack<String>();
        for (char c : ch) {
            text.push(String.valueOf(c));
        }
        Queue <String> reverse = new LinkedList<String>();

        //Pop each character to queue
        for(int i = text.size()-1; i>=0; i--){
            reverse.add(text.pop());
        }
        //remove each character from queue and
        StringBuffer sb = new StringBuffer();
        for(int i = reverse.size()-1; i>=0; i--) {
            sb.append(reverse.remove());
        }
        if (sb.toString().equals(itemLower)){
            welcomeText.setText( item + " is a Palindrome!");
        }else {
            welcomeText.setText(item  +" is not a Palindrome");
        }
    }
}