<h1>Реестр техники - REST-приложение с Open API v3 документацией в виде страницы swagger.</h1>

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/-Postgrasql-blue?style=for-the-badge&logo=appveyor)
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/-liquibase-blueviolet?style=for-the-badge&logo=appveyor)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

<br>

<h2>Назначение проекта</h2>

Проект реализации реестра техники с привязкой к ним моделей с собственными характеристиками. Реализован следующий функционал:

<body>
   <dev>
     <ul>
     <li>Добавлено по три позиции на каждый вид техники с двумя моделями для каждой;</li>
     <li>Реализован поиск по наименованию(без регистра), виду техники, цвету, цене;</li>
     <li>На каждый вид сделаны свои фильтры;</li>
     <li>Реализована сортировка по алфавиту и стоимости;</li>
     <li>Реализована возможность добавлять новые позиции и модели к ним;</li> 
    </ul>
   <hr>
     </dev>
  <dev>
     <h2>Сборка приложения:</h2>
<ul>
     <li>Удаленный репозиторий: https://github.com/Shuffle-code/api_spring, ветка develop</li>
     <li>После скачивания проекта, зменить значения в конфигурационном файле application.yml:
<p>spring:</p>       
<p>&ensp;datasource:</p>
<p>&emsp;url: </p>
<p>&emsp;username: </p> 
<p>&emsp;password: </p>    
  </li>
     <li>Создание jar-файла: Gradle->cleane->build</li>
     <li>Файл для запуска приложения:
     build/libs/api_spring-0.0.1-SNAPSHOT.jar</li>
   <li>Запуск: java -jar api_spring-0.0.1-SNAPSHOT.jar &</li>
   <li>Базу данных необходимо создать в удобной директории</li>
   <li>(в PostgresQl отсутствует: "?createDatabaseIfNotExist=true"),</li>
   <li>таблицы и наполнения создается автоматически с помощью liquibase</li>
</ul>
     </dev>
     <dev>
     <h2>Технические требования:</h2>
<ul>
     <li>JRE версии не ниже 8;</li>
     <li>PostgresQL версии не ниже 4;</li>
</ul>
     </dev>
</body>






