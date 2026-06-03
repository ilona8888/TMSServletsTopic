<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Time in Cities</title>
</head>
<body>
<h1><%= "Время в городах:" %>
</h1>
<br/>
<a href="/minsk">Время в Минске</a><br/>
<a href="/beijing">Время в Пекине</a><br/>
<a href="/washington">Время в Вашингтоне</a><br/>
<a href="/checkAge">Проверить возраст</a><br/>

<h2>Скачивание и загрузка файлов</h2><br/>
<form method="post" action="/load-book" enctype="multipart/form-data">
    Выберите файлы: <input type="file" name="loadFile" accept=".pdf" />
    <input type="submit" value="Загрузить" /><br/>

    <a href="/book">Скачать</a>
</form><br/>
</body>
</html>