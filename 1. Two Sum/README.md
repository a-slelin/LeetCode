# Задача №1 Two Sum

## Условие

Дан целочисленный массив nums и целое число target. Необходимо вернуть индексы двух чисел, которые в сумме дают
target.

## Решение

Первое, что приходит в голову так это просто перебрать все числа в двойном цикле и сравнить с target. Временная сложность
тогда будет O(n^2), а пространственная O(1). 

И, конечно, это решение глупое, нужно придумать алгоритм, который бы работал побыстрей. Для этого предлагается использовать
HashMap, которая увеличит нашу память до O(n), но и также уменьшит время - O(n). Предлагается следующий алгоритм:

1) В цикле проходимся по массиву.
2) Берём текущий элемент и записываем значение (nums\[i\]) в map (map.put(nums\[i\], i)). 
3) Далее проверяем нет ли в map значения (target - nums\[i\]). Если есть, то возвращаем необходимые значения. Если нет, то идём дальше.