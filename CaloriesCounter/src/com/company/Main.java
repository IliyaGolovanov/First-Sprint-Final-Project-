package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        while(true){
            printmenu();
            int command = scanner.nextInt();
            if(command == 1){
                stepTracker.SaveSteps();
            }
            else if(command == 2){
                stepTracker.statistics();
            }
            else if(command == 3){
                stepTracker.stepPurpose = stepTracker.NewStepPurpose();
            }
            else if (command == 4){
                break;
            }
            else {
                System.out.println("Извините, такой команды пока нет");
            }
        }
    }
    public static void printmenu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Напечатать статистику за определённый месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("4. Выйти из приложения");
    }
}
