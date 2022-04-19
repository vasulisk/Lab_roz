package com.company;

public class ZavSwitch {
    public ZavSwitch() {
    }

    public static void main(String[] args)  {
        String ask = "Відмовитись";
        String answer = "";


        switch (ask) {
            case "Погодитись":
                switch (answer) {
                    case "Yes":
                    case "+":
                    case "Ok":
                    case "OK":
                    case "Y":
                        System.out.println("Я погоджуюсь!");
                        break;}

                switch (ask) {
                    case "Відмовитись":
                        switch (answer) {
                            case "No":
                            case "-":
                            case "no":
                            case "N":
                            case "Ні":
                                System.out.println("Я відмовляюсь!");
                                break;}




                }
        }

    }
}
