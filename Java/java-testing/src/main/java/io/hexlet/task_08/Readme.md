### Напишите тесты для метода add(). 

___
Метод добавляет в список, переданный первым аргументом, элемент по указанному индексу.
Если в списке уже есть элемент по такому индексу, то он и все следующие элементы сдвигаются вправо. Если индекс не
передан, элемент добавляется в конец списка. В случае успешного изменения коллекции метод возвращает true. Метод меняет
переданный список

Метод принимает три аргумента:

* Первый – список List, в который нужно добавить элемент
* Второй – добавляемый элемент
* Третий (необязательный) - индекс, по которому будет вставлен элемент. Если индекс не передан, элемент будет добавлен в
конец списка