## 2.12. Тестирование
***
### Покрыть тестами веб-сервис калькулятор из дз 2.3.
#### Шаг 1. Доработать метод деления.

1. [x] Теперь, в случае передачи в качестве второго параметра числа 0, нужно выбрасывать исключение своего наследника `IllegalArgumentException` из метода калькулятора с соответствующим текстом ошибки. Использовать для проверки параметра контроллер больше нельзя.

#### Шаг 2. Написать тесты для всех методов калькулятора.
1. [x] Создать тестовый класс и написать в нем тесты для всех методов калькулятора. По 2 набора параметров на каждый.
2. [x] На метод деления написать дополнительный тест с проверкой выбрасывания исключения.

#### Шаг 3. Написать параметризованные тесты для методов калькулятора.
1. [x] Создать тестовый класс и написать в нем параметризованные тесты для методов калькулятора.
2. [x] Может потребоваться написать 4 параметризованных теста и один или несколько методов с набором аргументов. Тест на исключение дублировать не надо.

_Критерии оценки:_
1. [x] Код должен быть полностью покрыт тестами
2. [x] Код выполненное работы должен включать в себя первоначальный код и правки, сделанные на этапе решения задания 2.12. Если необходимо, прописаны комментарии
3. [x] В случае деление на 0 выбрасывается ошибка `IllegalArgumentException`
4. [x] Контроллер для проверки параметра не используется 
***