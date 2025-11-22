# Автоматизация тестирования [Rigla](https://www.rigla.ru/) <img src="https://vectorseek.com/wp-content/uploads/2023/09/Rigla-Logo-Vector.svg-.png" width="40" height="40"/>

> «Ригла» — федеральная аптечная сеть, входящая в число крупнейших компаний фармацевтического ритейла России. Является основой розничного сегмента группы компаний «Протек»

## Примеры автоматизированных тест-кейсов:
- Проверка наличия позиций в выпадющем списке 'Каталог'
- Проверка наличия категорий на главной странице
- Проверка ассортимента товаров по алфавиту
- Поиск товара
- Добавление товара в корзину

---

## Сборка в [Jenkins](https://jenkins.autotests.cloud/job/38-belebear-rigla_project_lesson12/) <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" widht="40" height="40" />

<p align="center">  
<img src="files/screen/Jenkins.png"/>
</p>

### Возможные параметры сборки в Jenkins:

<p align="center">  
<img src="files/screen/parameters.png"/>
</p>

## Запуск из терминала:

#### Для локального запуска
``` bash 
gradle clean mainPage_test
```

#### Для запуска из Jenkins
``` bash 
clean ${TESTS} -Dremote=${REMOTE} -Dbrowser=${BROWSER} -DbrowserSize=${BROWSER_SIZE} -DbrowserVersion=${BROWSER_VERSION}
```

## Отчетность в [Allure](https://jenkins.autotests.cloud/job/38-belebear-rigla_project_lesson12/allure/) <img src="https://github.com/RomaQA/RomaQA/blob/main/media/icons/allure-Report-logo.svg" widht="40" height="40" />

### Главная страница Allure Reports

<p align="center">  
<img src="files/screen/Allure2.png"/>
</p>

### Страница со всеми тест-кейсами и шагами

<p align="center">  
<img src="files/screen/Allure.png"/>
</p>

## Отчетность в Telegram <img src="files/icons/TG.svg" widht="40" height="40" />

### Краткий отчет после прохождения тестов от чат-бота

<p align="center">  
<img src="files/screen/riglaTG.png"/>
</p>

## Пример выполнения теста

<p align="center">
<img title="Selenoid Video" src="files/video/mkb.gif" width="550" height="350"  alt="video">   
</p>
