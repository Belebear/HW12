# Автоматизация тестирования [Rigla](https://www.rigla.ru/) <img src="https://vectorseek.com/wp-content/uploads/2023/09/Rigla-Logo-Vector.svg-.png" width="40" height="40"/>

> «Ригла» — федеральная аптечная сеть, входящая в число крупнейших компаний фармацевтического ритейла России. Является основой розничного сегмента группы компаний «Протек»

## Примеры автоматизированных тест-кейсов:
- Проверка наличия позиций в выпадющем списке 'Каталог'
- Проверка наличия категорий на главной странице
- Проверка ассортимента товаров по алфавиту
- Поиск товара
- Добавление товара в корзину

---

## Запуск тестов через терминал:

#### Для локального запуска
``` bash 
gradle clean mainPage_test
```

#### Для запуска из Jenkins
``` bash 
clean ${TESTS} -Dremote=${REMOTE} -Dbrowser=${BROWSER} -DbrowserSize=${BROWSER_SIZE} -DbrowserVersion=${BROWSER_VERSION}
```

## Сборка в [Jenkins](https://jenkins.autotests.cloud/job/38-belebear-rigla_project_lesson12/) <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" widht="40" height="40" />

<p align="center">  
<img src="files/screen/Jenkins.png"/>
</p>

### Возможные параметры сборки в Jenkins:

<p align="center">  
<img src="files/screen/parameters.png"/>
</p>

- BROWSER - параметр для выбора браузера
- BROWSER_SIZE - параметр для выбора разрешения, в котором будет открыт браузер
- BROWSER_VERSION - параметр для выбора версии браузера
- REMOTE - параметр для ввода адреса удаленного сервера, где будут выполняться тесты
- TESTS - параметр отвечающий за запуск по тестовой модели
- ENVIRONMENT - выбор окружения, на котором будут запускаться тесты
- COMMENT - параметр, отвечающий за сообщение, которое будет отправлено в телеграм с отчетом

## Отчетность в [Allure](https://jenkins.autotests.cloud/job/38-belebear-rigla_project_lesson12/allure/) <img src="https://github.com/RomaQA/RomaQA/blob/main/media/icons/allure-Report-logo.svg" widht="40" height="40" />

### Главная страница Allure Reports

<p align="center">  
<img src="files/screen/Allure2.png"/>
</p>

### Страница со всеми тест-кейсами и шагами

<p align="center">  
<img src="files/screen/Allure.png"/>
</p>

### По итогу прохождения тестов формируются:
- Скриншоты
- Код страницы
- Видео прохождения теста
- Логи

## Отчетность в Telegram <img src="files/icons/TG.svg" widht="40" height="40" />

### Краткий отчет после прохождения тестов от чат-бота

<p align="center">  
<img src="files/screen/riglaTG.png"/>
</p>

## Пример видео с выполнением теста
<p align="center">  
<img src="files/video/a028df8bf3b6b849cefecc5291a4d790.gif"/>
</p>
