package lesson5.homework;

import java.io.BufferedReader;
import java.io.IOException;


public class Tasks {
	//task1
	public int getMonthDays(int monthNumber) {
		int[] monthDays = {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31} ;
		return monthDays[monthNumber+1];
	}
	//task2
	public int calcSum(int[] numbers) {
		int sum = 0;
		boolean isNegative = false;
		for(int n:numbers) { 				//перевіряю чи є хоча відємні значення в масиві
			if(n<0) {
				isNegative = true; 			//і записую в змінну тру, якщо так
			}
		}
		if(isNegative) { 					//якщо true то добавляє в суму останні 5 значень масиві
			for(int i = numbers.length-1; i>=(numbers.length/2); i--) {
				sum+=numbers[i];
			}
		} else { 							//інакше перших 5
			for(int i = 0; i<numbers.length/2; i++) {
				sum+=numbers[i];
			}
		}
		return sum; 						//повертаю суму
	}
	//task3
	public int secondPositiveIndex(int... numbers) {
		int counter = 0; 					//змінна каунтер в які рахую кількість додатніх чисел
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i]>0) { 				//якщо число в масивы додатнє
				counter++; 					//збільшую каунтер на 1
				if(counter==2) { 			//і якщо каунтер рівний двом то повертаю індекс
					return i;				//метод завершується після виконання return
				}
			}
		}
		return -1; 							//інакше повертаю -1
	}
	public int findMinimum(int... numbers) {
		int minimumIndex = 0;				//звичайний алгоритм пошуку мінімального
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < numbers[minimumIndex]) minimumIndex = i;
		}
		return minimumIndex;
	}
	
	//task4
	public int calcProduct(BufferedReader br) throws IOException{
		int product = 1; 							//змінна для запису добутку
		int number = 0; 							//змінна для внесення данних з консолі
		System.out.println("Please enter numbers. Enter negative number to stop loop.");
		while(true) {
			number = Integer.parseInt(br.readLine());
			if(number < 0) break; 					//якщо введене з консолі відємне число то зупиняю цикл
			product *= number; 						//якщо ні то перемножую
		}
		return product; 							//повертаю добуток
	}
	//task5
	public String modulesInYear(int year, Car... cars) throws IOException{
		String str = "Models released in "+year+":\n";
		for(Car c: cars) {
			if(c.getProductionYear()==year) str+=c.getType()+" "; 	//і добавляю список моделей у стрінгу
		}
		return str;												//повертаю стрінку
	}
	public void sortByYear(Car... cars) { //алгоритм сортування бульбашкою
		Car tcars;
		for(int i = 0; i < cars.length; i++) { 
			for(int j = i+1; j < cars.length; j++) {
				if(cars[i].getProductionYear()>cars[j].getProductionYear()) {
					tcars = cars[i];
					cars[i] = cars[j];
					cars[j] = tcars;
				}
			}
		}
		
	}
	
	
}
