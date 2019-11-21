package com.company.advanced_with_java.collections.homeworks.exceptions;

public interface Calculator {

    /*  @param x - первый параметр
     *  @param y - второй параметр
     *  @return возвращает сумму двух параметров x и y
     *   @throws CalculatorException - возникает при переполнении переменной
     */


    int sum(int x, int y) throws CalculatorException;

            /*  @param x - первый параметр
              @param y - второй параметр
              @return возвращает разницу двух параметров x и y*/

    int diff(int x, int y) throws CalculatorException;

    /* @param x - первый параметр
     * @param y - второй параметр
     * @return возвращает произведение двух параметров x и y
     * @throws CalculatorException - возникает при переполнении переменной
     */
    int mult(int x, int y) throws CalculatorException;
            /* @param x - первый параметр
              @param y - второй параметр
              @return возвращает частное от деления двух параметров x и y
              @throws DevideByZeroException - возникает при делении на 0, класс DevideByZeroException
              должен наследоваться от CalculatorException   */

    int div(int x, int y) throws DevideByZeroException;
}

