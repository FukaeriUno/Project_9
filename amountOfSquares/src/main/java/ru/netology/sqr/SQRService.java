package ru.netology.sqr;

public class SQRService {
    public int sqrAmount(int num1, int num2) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= num1 && i * i <= num2){
                counter++;
            }
        }
        return counter;
    }
}
