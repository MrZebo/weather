<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/>
<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Weather</title>
    <style>
        td {
            padding: 5px; /* Поля в ячейках */
            vertical-align: top; /* Выравнивание по верхнему краю ячеек */
        }
    </style>
    <%--<script type="text/javascript">--%>
        <%--function shiftSubDiv(n)--%>
<%--// Скрывает/раскрывает подразделы меню с ID вида subDiv1, subDiv2 и т.д.--%>
<%--// Номер подраздела передается в качестве аргумента.--%>
        <%--{--%>
            <%--var el = document.getElementById('subDiv'+n);--%>

            <%--if ( el.style.display === 'none' )--%>
                <%--el.style.display = 'block'--%>
            <%--else--%>
            <%--if ( el.style.display === 'block' )--%>
                <%--el.style.display = 'none';--%>
        <%--};--%>
    <%--</script>--%>
</head>
<body>
<table>
    <tr>
        <td>
            <table>
                <h2>OpenWeather</h2>
                <c:forEach items="${daysOPENWEATHER}" var="day">
                    <tr>
                        <td>${day.dt_txt}</td>
                        <td>${day.getCelsiumTemp()}</td>
                        <td>${day.getConditions().getMain()}</td>
                    </tr>
                </c:forEach>
            </table>
        </td>
        <td>
            <table>
                <h2>MeteoPost</h2>
                <c:forEach items="${meteoPostDays}" var="day">
                    <tr>
                        <td>${day.month}</td>
                        <td>${day.date}</td>
                        <td>${day.dayOfWeek}</td>
                    </tr>
                    <c:forEach var="day" items="${day.forecastList}">
                        <tr>
                            <td>${day.timesOfDay}</td>
                            <td>${day.temperature}</td>
                            <td>${day.precipitation}</td>
                        </tr>
                    </c:forEach>
                </c:forEach>
            </table>
        </td>
        <td>
            <table>
                <h2>WunderGround</h2>
                <c:forEach var="day" items="${hourlyForecastDays}">
                    <tr>
                        <td>${day.getSimpleDate() }</td>
                        <td>${ day.getTemp().getMetric()}</td>
                        <td>${day.getCondition()}</td>
                        <td>${day.getPop()}</td>
                        <td><img src="${day.getIcon_url()}" width="50"
                                 height="50" alt="Погода" border="0"></td>
                    </tr>
                </c:forEach>
            </table>
        </td>
        <td>
            <table>
                <h2>APIxu</h2>
                <c:forEach items="${daysAPIxu}" var="day">
                    <tr>
                        <td>${day.date}</td>
                        <td>${day.day.getAvgtempC()}</td>
                            <%--<td>${day.astro.sunrise}</td>--%>
                            <%--<td>${day.day.condition.text}</td>--%>
                        <td><img src="${day.day.condition.icon}" width="50"
                                 height="50" alt="Погода" border="0"></td>
                            <%--<td>${day.day.condition.icon}</td>--%>
                    </tr>
                </c:forEach>
            </table>
        </td>
        <td>
            <table>
                <h2>Gismeteo</h2>
                <c:forEach items="${gisMeteoDailyForecasts}" var="day">
                    <tr>
                        <td>${day.getDayOfWeak()}</td>
                        <td>${day.getDate()}</td>
                        <td>${day.getDayCloudy()}</td>
                        <td>${day.getDayTemperature()}</td>
                        <td>${day.getNightCloudy()}</td>
                        <td>${day.getNightTemperature()}</td>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </tr>
</table>
</body>
</html>