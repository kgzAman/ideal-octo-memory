package com.company;

public interface Conectable {
    void OpenConnection();
//    Открыть соединение с базой данных
    void CloseConnection();
//     Закрыть соединение с базой данных
    void CheckConnection();
//    Проверить есть ли соединение с базой
    void scanKey();
//     Считать одну запись (строку) по индексу
    void creatKey();
//    Проверить есть ли запись по такому-то ключу
    void scanIndex();
//    Считать одну запись по ключу
    void scanValue();
 //    Считать из базы некоторый набор записей. Метод может принимать или начальный индекс
//    и количество записей, или начальный и конечный индекс. На выходе массив или
//    коллекция записей.
    void getAmountOfKey();
//    Узнать количество записей в базе
    void AddKey();
//    Добавить запись в базу
    void resetIndex();
//    Обновить значение записи по индексу
    void changValueOfKey();
//    Обновить содержимое записи по ключу
}
