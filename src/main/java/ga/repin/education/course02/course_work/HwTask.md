## Курсовая работа 2-го курса
***
В курсовой работе ко второму курсу вам необходимо реализовать приложение, которое будет генерировать вопросы к экзамену.

### Путь пользователя
1. Пользователь обращается к эндпоинту по адресу (`”/exam/get/{amount}”`)
2. Пользователь получает ответ в виде списка случайных вопросов-ответов, количество которых равно amount из прошлого шага
3. Пользователь должен иметь возможность добавить, получить и удалить вопросы из хранилища вопросов (`”/exam/java/(add/remove)”`)


### Реализация приложения
#### Рекомендации по организации проекта.

1. Реализовать сущность **Question** с двумя полями: **question** и **answer**. Данная сущность будет использоваться в качестве хранителя данных по вопросу.
2. Сделать интерфейс **QuestionService**, который будет содержать в себе все методы по работе с вопросами определенного предмета.
3. Реализовать сервис **JavaQuestionService**, который будет реализовывать **QuestionService** и хранить в себе список вопросов по Java, а также осуществлять всю работу с этим списком. Реализация метода **getRandomQuestion** осуществляется с помощью класса `Random` и его метода `nextInt`, который в качестве параметра принимает максимальное число, а затем возвращает вам результат в виде случайного числа от 0 до максимального числа из параметров (не включительно).
4. Реализовать контроллер **JavaQuestionController**, который будет предоставлять возможность пользователю добавлять, просматривать и удалять вопросы по Java в соответствующем **QuestionService**. Контроллер должен иметь три метода на следующих эндпоинтах:   
    * Добавить: `“/exam/java/add?question=QuestionText&answer=QuestionAnswer”`
    * Удалить: `“/exam/java/remove?question=QuestionText&answer=QuestionAnswer”`
    * Получить все вопросы: `“/exam/java”`
5. Сделать интерфейс **ExaminerService** с одним методом **getQuestions**. Этот интерфейс должен содержать один метод, который вернет список вопросов.
6. Реализовать ExaminerServiceImpl, который является реализацией интерфейса из прошлого шага. Данный сервис должен внутри себя хранить поля типа QuestionService.
   Его задача: создать коллекцию и заполнить её с помощью вызова getRandomQuestion у QuestionService случайными вопросами.
_критерии оценки_
    * Вопросы должны быть уникальные, следовательно, для получения 5 вопросов может потребоваться более 5 вызовов метода `getRandomQuestion` сервиса вопросов.
    * Если запрошено большее количество вопросов, чем хранится в сервисе, нужно выкинуть исключение. Для этого, соответственно, нужно написать свое исключение со статусом `BAD_REQUEST`.
7. Реализовать контроллер `ExamController` с одним методом `getQuestions(int amount)`.
      Контроллер должен обратиться к `ExaminerService`, получить от сервиса коллекцию вопросов и вернуть пользователю.
8. Покрыть юнит-тестами `JavaQuestionService` и `ExaminerServiceImpl` (потребуется мок).
***