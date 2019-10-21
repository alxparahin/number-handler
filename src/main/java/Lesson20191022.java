/*
    Задачи
1.	Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.
2.	Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.
3.	Вывести англ. алфавит по 5 букв в строке.
*/

public class Lesson20191022 {

    public static void zeroStrings(int stringsNumber){
        for(int i = 0; i < stringsNumber; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("0");
            }
            System.out.println("");
        }
    }

    public static void englishByNumber(int number){
        for(int i = (int)'a'; i <= (int)'z'; i++){
            System.out.print((char)i);
            if((i-1)%number == 0 || i == (int)'z'){System.out.println("");}
        }
    }

}
