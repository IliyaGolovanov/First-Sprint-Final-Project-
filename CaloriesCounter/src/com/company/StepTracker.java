package com.company;

import java.util.Scanner;

import static com.company.MonthData.days;

public class StepTracker {
    int StepPurpose = 1000;
    Scanner scanner = new Scanner(System.in);
    MonthData[] monthToData;
    Converter converter = new Converter();
    public StepTracker(){

        monthToData = new MonthData[12];
        for(int i = 0; i < monthToData.length; i++){
            monthToData[i] = new MonthData();
        }
    }
    int stepPurpose = 10000;
    int NewStepPurpose(){
        System.out.println("Введите новое значение цели шагов");
        int newStepPurpose = scanner.nextInt();
        System.out.println("Новое значение цели шагов " + newStepPurpose + " шагов.");
        return newStepPurpose;
    }
    int bestSeries(){
        int bestStreak = 0;
        for(int i = 0; i < days.length; i++){
            if(days[i] >= stepPurpose){
                bestStreak = bestStreak + 1;
            }
        }
        return bestStreak;
    }
  long SaveSteps(){
      System.out.println("Введите месяц");
      int month = scanner.nextInt();
      System.out.println("Введите день");
      int day = scanner.nextInt();
      System.out.println("Введите число шагов");
      long numberOfSteps = scanner.nextLong();
      System.out.println("Количество шагов в месяце " + month + " за день " + day + " составило " + numberOfSteps + " шагов.");
      days[day] = numberOfSteps;
      return days[day];
  }
  void statistics(){
      System.out.println("Введите месяц, за который вы хотите посмотреть статистику");
      int month = scanner.nextInt();
      stepsPerDay();
      System.out.println("Количество шагов пройденных в месяце " + month + " составило " + sumSteps(month) + " шагов.");
      System.out.println("Среднее число шагов в месяце " + month + " составило " + middleSteps(sumSteps(month)) + " шагов.");
      System.out.println("Максимальное число шагов в месяце " + month + " составило " + findMaxSteps() + " шагов.");
      System.out.println("Пройденное расстояние составило " + converter.distance(sumSteps(month)) + " километров.");
      converter.calories(sumSteps(month),month);
      System.out.println("Серия лучших дней за месяц " + month + " составила " + bestSeries() + " дней/день.");
  }

  void stepsPerDay(){
        for(int i = 0; i < days.length; i++){
            System.out.println("День " + (i + 1) + ". Потрачено " + days[i] + " шагов.");
        }
  }
  long sumSteps(int month){
      long sum = 0;
      for(int i = 0; i < days.length; i++){
          sum = days[i] + sum;
      }
      return sum;
  }
  long middleSteps(long sum){
        long middleSteps = sum / days.length;
        return middleSteps;
  }
  long findMaxSteps(){
       long maxStep = 0;
       for(int i = 0; i < days.length; i++){
           if(maxStep < days[i]){
               maxStep = days[i];
           }
       }
       return maxStep;
  }

}
class MonthData{
    static long[] days = new long[30];
}
