<h1>Реестр техники - REST-приложение с Open API v3 документацией в виде страницы swagger.</h1>

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/-Postgrasql-blue?style=for-the-badge&logo=appveyor)
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![GitHub](https://img.shields.io/badge/-liquibase-blueviolet?style=for-the-badge&logo=appveyor)
<br>

<h2>Назначение проекта</h2>

Проект предназначен для администрирования соревнований по настольному теннису и предоставляет следующий функционал:

<body>
   <dev>
     <ul>
     <li>ведение картотеки игроков;</li>
     <li>ведение картотеки турниров;</li>
     <li>предоставление игрокам возможности регистрироваться на турниры;</li>
     <li>трансляция текущего счета в виде демонстрации таблицы с результатами сетов;</li>
     <li>сохранение результатов турнира в базе данных, с пересчетом рейтинга каждого игрока;</li>
     <li>для рефери: ведение счета турнира с автоматическим определением победителя в каждом сете и в игре;</li>   
    </ul>
   <hr>
     </dev>
  <dev>
     <h2>Сборка приложения:</h2>
<ul>
     <li>Удаленный репозиторий: https://github.com/Shuffle-code/tt_nsk, ветка master</li>
     <li>После скачивания проекта, зменить значения в конфигурационном файле application.yml:
<p>spring:</p>       
<p>&ensp;storage:</p>
<p>&emsp;location: </p>
<p>&ensp;mail:</p>
<p>&emsp;username: </p> 
<p>&emsp;password: </p>    
  </li>
     <li>Создание jar-файла: Gradle->cleane->build</li>
     <li>Файл для запуска приложения:
     build/libs/tt_nsk-0.0.1-SNAPSHOT.jar</li>
   <li>Запуск: java -jar tt_nsk-0.0.1-SNAPSHOT.jar &</li>
   <li>База данных при её отсутствии, создается с помощью liquibase</li>
</ul>
     </dev>
     <dev>
     <h2>Технические требования:</h2>
<ul>
     <li>JRE версии не ниже 17;</li>
     <li>MySQL версии не ниже 8.0;</li>
</ul>
     </dev>
</body>






