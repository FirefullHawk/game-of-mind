### Hexlet tests and linter status:
[![Actions Status](https://github.com/FirefullHawk/java-project-61/workflows/hexlet-check/badge.svg)](https://github.com/FirefullHawk/java-project-61/actions) <a href="https://codeclimate.com/github/FirefullHawk/java-project-61/maintainability"><img src="https://api.codeclimate.com/v1/badges/c42eaaa913d5821535fe/maintainability" /></a>

# Игры разума

Данный проект представляет собой сборник из пяти математических игр для ментальной разминки - от простых действий по определёнию чётности или нечётности, до определения пропущенного члена арифметической прогрессии и определение простого числа. В каждой игре содержится по три раунда, после которых считается что игра пройдена. В случае неверного ответа, на любом этапе, игра останавливается.

# Описание игр

* Even - пользователю предлагается определить, чётное или нечётное число ему представлено

* Calc - пользователю требуется дать решение предложенной арифметической операции

* OGD - пользователю предлагается определить наибольший общий делитель двух чисел

* Progression - пользователю пределагается определить пропущенный член арифметической прогрессии

* Prime - пользователю предлагается определить, простое ли число ему представлено

### Демонстрация игр

https://asciinema.org/a/ljbT0snbhmRtPTSlMsT39KmqK - Even game

https://asciinema.org/a/ACZhZOyicAJNXA8xf91SdovLq - Calc game

https://asciinema.org/a/pcHu63h3iN646sAh13fpX7bzl - OGD game

https://asciinema.org/a/OHzZyPKgH7PKzVBZIB3X1qdgN - Progression game

https://asciinema.org/a/gVJgd3iZPr7qQxnYjHRnExrf8 - Prime game

### Как запустить на UNIX

1. Первым делом нужно скопировать гит репозиторий в подходящию для вас папку.

> git clone https://github.com/FirefullHawk/java-project-61
 
2. Перейти в папку с исполнительным файлом

> cd java-project-61/app
 
3. Собрать билд с игрой

> make install
 
4. Запустить игру на запуск

> make run-dist

### Автор

Симанов Дмитрий \ FirefullHawk

