/*
    Задачи
1.	Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.
2.	Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.
3.	Вывести англ. алфавит по 5 букв в строке.
*/

public class Lesson20191022 {

    public static int zeroStrings(int stringsNumber){
        int returnNumber = 0;
        for(int i = 0; i < stringsNumber; i++){
            for(int j = 0; j <= i; j++){
                returnNumber++;
                System.out.print("0");
            }
            System.out.println("");
        }
        return returnNumber;
    }

    public static int englishByNumber(int number){
        int returnNumber = 0;
        for(int i = (int)'a'; i <= (int)'z'; i++){
            returnNumber++;
            System.out.print((char)i);
            if((i-1)%number == 0 || i == (int)'z'){System.out.println("");}
        }
        return returnNumber;
    }

}
